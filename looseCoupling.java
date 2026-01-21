package AmitItString;
 interface Engine{
void start();
}
class PetrolEngine implements  Engine {

    @Override
    public void start() {
        System.out.println("the car engine is start");
    }
}

 class Car {
    private Engine engine;

    Car (Engine engine) {
        this.engine = engine;
    }
    void drive() {
        engine.start();
    }
}
class WaysToCreateObject{
    public static void main(String[] args) {
        Engine engine = new PetrolEngine();
        Car car = new Car(engine);
        car.drive();

    }

}
// we can achive loose couling in java
// by using aggration in has a realtion-ship
// by using factory we also do this


        int arr[]={8,3,4,6,2};
        int target=7;
        for(int i=0;i< arr.length-1;i++){
            for (int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==target){

                    System.out.println("we can declared here indec values " + i +" "+j);


                 // tragtting element is equal to string each pairsum i equal to traget
                 



                    









