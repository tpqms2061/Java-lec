package lec9;


class Vehicle {
    String brand;


    public Vehicle(String brand) {
        this.brand= brand;

    }
    public void display() {
        System.out.println("brand = " + brand);
    }
}


class Car extends Vehicle {
    String model;

    public Car(String brand, String model) {
        super(brand);
        this.model = model;
    }

}

public class InheritanceTest {
    public static void main(String[] args) {

        Car car = new Car("hyundai", "sonata");

        car.display();

    }
}
