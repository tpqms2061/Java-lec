package lec11.InnerClass;

class Car {
    String brand;
    Engine engine;

    public Car(String brand) {
        this.engine = new Engine();
        this.brand = brand;
    }

    class Engine{
        public void start() {
            System.out.println("the engine of " + brand + "is starting");
        }
    }

    public void startEngine() {

        engine.start();
    }


}
public class InnerClass {
    public static void main(String[] args) {
        Car car = new Car("빠른 자동차");

        car.startEngine();
    }

}
