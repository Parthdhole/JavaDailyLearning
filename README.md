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

     b)What is the difference between Encapsulation and Abstarction?
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
we can achieve the polymorphism with the help of method overriding and overlodaing

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




                                             Arrays :-
 
                                                        Arrays are use to  store the group element's as a single object in contagious memory location
                                                        Arrays are fix in size one's we create a array we cannot increase or decreases the size
                                                        Arrays not support any method operation 
                                                       it can store the primitive data and object primitive

  
                                                                                    Collection:-

                                                        Collection are the root interface of collection frame work
                                                        it represents the group of elements as a single unit
                                                        It can store both homogenous & heterogenous data. 
                                                        Collections are growable in nature it will increase & decrease the size as per the need.
                                                        it can have methods to perform operation
                                                        Collections can store only object data. 

                                  -collection is use to store the group of object as a single entity collection is a interfaces which has multiple implementation
                                   list,set and queue 


                                                                There are two part's of collections framework
                                                                                      |
                                                                                      |
                                                                       Collection                map     
                                                                             

                                                                                       collection    
                                                                                          | 
                                                                          list           set               queue
                                                                           |
                                                                           
                                                            ArrayList(c)    LinkedList(c)     vector(c) 
                                                                                  |
                                                                               stack(c)





                                                     1)Arraylist:-
                                                      Array List is implementation class of list interface
                                                      it are allow duplicates and insertion order is maintained
                                                      it also good for reading operation  because it can access every element with same speed
                                                      but it not good for frequent writing operation because it create a new array and copied element on array to another 
                                                      and it is costly and timing consuming.   
                                                      and under line data structure is resizable array
                                                                                                                


                                                     2)LinkedList:-
                                                      LinkedList is implementation class of the list interface
                                                      it are allow duplicates also and insertion order is preserve 
                                                      it is good for writing orations and bad for reading operation 
                                                      underline data structure is doubly linked list 







race Condition :- more than one thread can are executing the same resource or variable there is possibility is share Variable output or value is wrong so all the theses are saying my condition is correct so it caked race Condition 

critical sections :- the part of program have that has shared resources  is called critical section
  - what happened inside it if any thread can access this section it check any one is there is not then enter and do lock it until it completer it after that other thread can access it


                                                      v





















    

--------- The method that capable to return a object is called factory method  
          the factory method internally create and delete the object using new keyword
    
                                                           
          Runtime R=Runtime.getRuntime();
   
        public static void main(String[] args) {
        Runtime r =Runtime.getRuntime();
        System.out.println("tot  memory"+r.totalMemory());
        System.out.println("tot free memory"+r.freeMemory());
        for(int i=0;i<1000000;i++){
            GarbageColector gcc = new GarbageColector();
        }
        System.out.println("tot  memory"+r.totalMemory());
        r.gc();
        System.out.println("tot free memory"+r.freeMemory());




    }


Scenario base :-
class Emp{}

class Test
 Emp m1(){
        Emp gcc1 = new Emp();
         Emp gcc2 = new Emp(); // this object is eligibal for gc
        System.out.println(gcc1);
        return gcc1;
    }
main
{
Emp e = new Test().m1();
  // here we holding the object the on object gcc1 so gcc2 is destroyed 
}


---------------***---------------------------
class Emp{}

class Test
 Emp m1(){
        Emp gcc1 = new Emp();
         Emp gcc2 = new Emp(); // this object is eligibal for gc
        System.out.println(gcc1);
        return gcc1;
    }
main
{
Emp e = new Test().m1();
  // here we holding the object the on object gcc1 so gcc2 is destroyed 
}



todya i was learned about the Tostring internalls and hashcode 



HashCode() of a key is first generated, and then a hash function is applied to that hash value to calculate the index of the bucket in the HashMap. This index decides where the key-value pair will be stored. The purpose of using a hash function is to convert a potentially large hash value into a valid index within the internal array size. This approach reduces collisions and provides efficient lookup performance.”



Linked HashMap:-it is implantation class if map interface where  having duplicates are not allow but insertion order is maintained

Why it insertion order is maintained -> because it store in double LinkedList format because of this slow as compare to HashMap

it having one constructure which contained access order=true then it can give the element that is not in use that display on the top



  String[] str = {"Parth","om","amit it"};


        for (int i =0;i<str.length;i++){
            String s = str[i];
            for (int j = 0; j < s.length(); j++) {
                char ch = s.charAt(j);
                System.out.println(ch);
            }

        }


//        List<String>list= Arrays.asList(str);
//        System.out.println(list);
//        Collections.sort(list);
//        System.out.println(list);
//
//        Set<String> listt = new TreeSet<>((o1, o2) ->o1.compareTo(o2));
        CopyOnWriteArrayList<String> listt = new CopyOnWriteArrayList();
         listt.add("parth");
         listt.add("om");
         listt.add("amit");
         System.out.println(listt);
//
//    


soting ex today addes here 
1)buuble sort
2)insertion sort
3)cyclic sort

we can do sporting in diffrent way and use in solve the diffrent problems

work 24 dec:
learning the  builder desgin pattern for batter code reusablity 
it is creation type desgined pattern which  help give more feziblity to pass the parameter so need to create a constructore 


thread vs Runnable
->by extend thread class we can not cannot extends another class but by using runnable interface we can use achieve it
->in thread approach we not achieve Multiple inheritance but in runnable it support
 - Thread base approach is not recommend 

Which one is better: Thread or Runnable? Why?
->Java provides two ways to create a thread.
Implementing Runnable is better and recommended because it supports multiple inheritance and separates task from thread.


What is the start() method?
->it is used to begin the execution of a new thread in Java.Internally, it calls the run() method and the thread is scheduled by thread schedular

Can we call run() directly? What happens?
Yes, we can call run() directly, but it does not start a new thread.it behave like normal method


What is JVM role in thread execution?
The JVM creates and manages threads, invokes the run() method, coordinates scheduling with the OS, and controls the thread lifecycle.

Thread.currentThread() is a static method of the Thread class that returns a reference to the currently executing thread.


life cycle of thread
The Java thread lifecycle consists of New, Runnable, Running, Blocked/Waiting, and Terminated states managed by the JVM.





                                                                                      Reflection

Reflection is  feature of java that allow a programmer to inspect  and manipulate classes methods ,field, and constructure at runtime even if they are private 

It is provided by the java.lang.reflect package.


✅ Key Points (Notes)
Works at runtime
Can access private members
Breaks encapsulation
Mostly used by frameworks like Spring & Hibernate
the ex this in collection folder reflection package 



        // Case 1: String literal
        String s1 = "Java";
        String s2 = "Java";
        Objects created: 1
        Stored in String Constant Pool (SCP)
       ➡ s1 and s2 point to same object

        // Case 2: new keyword
        String s3 = new String("Java");
        String s4 = new String("Java");
        Objects created: 2 (Heap)
        SCP object already exists from Case 1
       ➡ Total here = 2 new heap objects

        // Case 3: literal + new
        String s5 = "Hello";
        String s6 = new String("Hello");
        Objects created: 2
        1 in SCP ("Hello")
        1 in Heap (new String())

        // Case 4: concat
        String s7 = "Par";
        String s8 = s7 + "th";
        Objects created: 3
        "Par" → SCP
        "th" → SCP
        "Parth" → Heap (runtime concat)

        // Case 5: compile-time concat
        String s9 = "Par" + "th";
        Objects created: 1
        Compiler optimizes it
        "Parth" directly goes to SCP

        // Case 6: intern()
        String s10 = new String("World").intern();
        Objects created: 2
        "World" → Heap
        "World" → SCP (if not already present)
        The intern() method in Java is used to put a String object into a special memory area called the String Constant Pool and return its     
        reference.







                                                                
