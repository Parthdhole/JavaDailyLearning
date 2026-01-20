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
// by using aggration in has a  realtion ship









