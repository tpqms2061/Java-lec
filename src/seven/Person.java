package seven;

class People {

    String name;
    int age;

    public People(String inputName, int inputAge) {
        name = inputName;
        age = inputAge;
    }

    void hello() {
        System.out.println("hello");
    }

}

public class Person {
    public static void main(String[] args) {
        People p = new People("ssh", 30);
        p.hello();

    }

}
