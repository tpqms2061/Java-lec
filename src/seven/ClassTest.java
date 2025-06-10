package seven;

public class ClassTest {


    public static void main(String[] args) {

        Car car = new Car();
        car.brand = "Hyundae";
        car.year = 2010;

        car.displayInfo();

    }
    static class Car {
        String brand;
        int year;

        public void displayInfo() {
            System.out.println("브랜드 : " + brand + "연식 :" + year);
        }

    }


}


