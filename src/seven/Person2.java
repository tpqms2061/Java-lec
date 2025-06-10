package seven;

class People1 {

    String name;
    int age;

    public People1(String name, int age) {
        this.name = name;
        this.age = age;  //this는 나 자신
    }

    void hello() {
        System.out.println("hello");
    }

}

public class Person2 {
    public static void main(String[] args) {
        People1 p = new People1("ssh", 30);
        p.hello();

    }

}
