package six;

public class OverLoadTest {

    public static void main(String[] args) {
        great();
        great("Alice");
        great("max", 20);


    }

    public static void great() {
        System.out.println("Hello, World");

    }

    public static void great(String name) {
        System.out.println("Hello," + name);

    }

    public static void great(String name, int age) {
        System.out.println("Hello," +name + ",age :" + age);
    }
}
