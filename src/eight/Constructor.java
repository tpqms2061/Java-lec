package eight;

class Person {
    String name;
    static int age= 20;

    public Person(String name, int age) {
        this.name = name;
        this.age= age;
    }

    public Person() {
    }


}

public class Constructor {

    public static void main(String[] args) {

        Person p1 = new Person("서승환", 20);
        Person p2 = new Person();
        System.out.println(Person.age);


    }
}
