here we can do pratical of ArryaList  
                                        iteralble(I)
                                          |
                                          |
                                      Collection(I)                                             map
                                           |                                                     |
                                           |                                                     |
                        List              set         queue                  HashMap        LinkedHashMap        TreeMap 



1.What is encapsulation? 
- binding the data as a single unit is called encapsulation we can achive the encapsulation by making the all variables private and using the getter setter methods
it help to achive 1)data hiding ,improve code security and I also help for loose coupling

      a)Why do we use Encapsulation?
      ->because it provide the controlled access and provide data integrity

     b)What is the difference between Encapsulation and Abstraction?
        Encapsulation->hide the data by restricting direct access
                     ->Encapsulation is about how data is accessed

        Abstraction:-hides the implementation and shows only essential features.
                     abstraction is about what is shown to the user.

     c)Is Encapsulation the same as Data Hiding?
      ->Encapsulation supports data hiding, but both are not the same.
        
     d)Can we make methods private in Encapsulation?
       ->yes, but this method are for internal logics hiding like we cannot access this  method outside the class



    
2.What is interface? 
->An interface in Java is a blueprint of a class, declared using the interface keyword.
All methods in an interface are public and abstract by default, and all variables are public, static, and final.
Interfaces cannot have constructors, instance blocks, or static blocks because they cannot be instantiated.
From Java 8 onwards, interfaces can contain default, static, and private methods, and they can even have a main method.
Interfaces are mainly used to achieve abstraction and multiple inheritance in Java

Scenario 1: You want to enforce that all payment types (UPI, Card, Wallet) must implement the same functions. What will you use?
Answer:
I will create a Payment interface with method declarations like pay(), validate(), refund().
Each payment type will implement this interface.
Scenario 2: You want a feature where all classes must implement a method, but you also want to give optional implementation.
Answer:
I will use an interface with default methods so that optional implementation is provided.
Scenario 5: You want some methods to be hidden inside the interface.
Answer:
I will use private methods inside the interface (Java 9+) to avoid code duplication within default/rest methods.


3.What is polymorphism? 
-same name but different from  is called polymorphism
we can achieve the polymorphism with the help of method overriding and overloading 

2)Compile-Time Polymorphism (Method Overloading)
-in this we should have same method name and input argument must be different  
access modifier and return type should be anyting
1)Runtime Polymorphism (Method Overriding)

->if you can satisfied with parent class implementation then you can override the parent class into a child is called overriding 
 here method argument,method signature must be same and method siganatre  should be same or covarient

Scenario 1: You call draw() using a parent class reference, but it runs the child class method. What is happening?
Answer:
This is runtime polymorphism (method overriding).
The method call depends on the object, not the reference.
ex-
class main {
    public static void main(String[] args) {
        Shape s = new Circle();  // parent reference, child object
        s.draw();                // calls child draw() → runtime polymorphism
    }
}
Scenario 2: A method must behave differently depending on which object calls it. What is this?
Answer:
This is runtime polymorphism.

Scenario 3: Why is polymorphism useful in real-time projects?
Answer:
It increases reusability, reduces code duplication, and allows flexible behavior based on the object.

Scenario 4:
Your project uses a parent reference like Shape s = new Circle(); and then calls s.area(). What is this?
Answer:
This is dynamic method dispatch, a form of runtime polymorphism.

4.What is abstract class? 
Abstraction hides implementation and shows only essential features.
Abstract class supports abstraction and may or may not contain abstract methods.
Object creation is not allowed because the class is incomplete.
However, constructors are allowed and used to initialize parent properties when a child object is created.

5.Difference between abstract class and interface?

abstract classes:-
abstract hides the implementation details and show only essential features
in abstract classes constructure are allowed 
Object creation is not possible



interfaces:-
interfaces it service details not a implementation details  
in interfaces classes constructure are not allowed 
Object creation is not possible
also interface are use in achieve multiple inheritance and abstraction
  

6.What are the Access Modifiers ? 
Access Modifiers in Java are keywords used to control the visibility of classes , methods , constructor 

7.What is inheritance? 
- in inheritance we can inherit the property and behaviour form parent to child is called inheritance 
- we can achieve inheritance with the help of extends keyword
-main purpose of inheritance is code reusability
-disadvantage is it can inherit all properties from parent to child if we required are not

        there are three type of inheritance 
1)Single -> Single inheritance is when one child class inherits the properties of one parent class 
2)Multilevel -> multilevel inheritance, the inheritance chain continues for multiple levels — like grandfather → father → child.
3)multiple ->Java does not support multiple inheritance with classes, but we can achieve it using interfaces.
8.What is multiple inheritance? 
9.What is ambiguity error?  
12.What is constructor? 
-> it'a special type of method without return type
and name of constructor same as a class name
it call  automatically when object is created
the main purpose of constructor that initializing the state of object 
there are three types of cons :-
1)default
2)parametrized
3)default constructor 
  
13.What is this keyword?
this is a reference variable in Java that refers to the current object of the current class.

13.What is static keyword? 
->The static keyword is used to create class-level members that belong to the class instead of an object.
Static variables and methods can be accessed using the class name, and memory is allocated only once.
14.What is static method? 
A static method is a method that belongs to the class, not to an object.
It can be called using the class name, and it is loaded into memory when the class is loaded.

note:-
When a Java program runs, the JVM first uses the Class Loader to load the required classes. The class is loaded into memory at runtime, and only after loading a class can the JVM execute its static blocks, static variables, and methods like main().

15.What is final keyword? 
The final keyword in Java is used to restrict modification.
When we use final, it means no change is allowed to the variable, method, or class.

by using this we can cannot be inherited the class , final method cannot be overridden and final variable cannot be change 










                                                                
