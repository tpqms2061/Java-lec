package eight;

class Car {

    String brand;
    int year;
    String model;

    public Car(String brand, int year) {
        this.brand= brand;
        this.year = year;

    }
    public Car(String brand, int year, String model) {
        this.brand= brand;
        this.year = year;
        this.model = model;

    }

    public void displayInfo() {

        String modelname = this.model != ""? this.model : "";
        System.out.println(" 모델 :" + brand + ", 연식은: " +year + ", 모델은 : " + modelname);

    }
}

public class ConstructorTest {

    public static void main(String[] args) {

        Car car = new Car("hyndae", 20);
        Car car2 = new Car("KIA", 30, "sonata");

        car.displayInfo();
        car2.displayInfo();

    }
}
