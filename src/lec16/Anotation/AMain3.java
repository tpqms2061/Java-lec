package lec16.Anotation;

@FunctionalInterface
interface Greeting{
    void sayHello(String name);

}

public class AMain3 {

    public static void main(String[] args) {
        Greeting greeting = (name) -> System.out.println("Hello " + name);

        greeting.sayHello("Alice");

    }
}
