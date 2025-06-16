package lec10.Abstract;


abstract class Animal {

    abstract void makeSound();

    public void sleep() {
        System.out.println("쿨쿨");
    }
}
class Dog extends Animal {

    @Override
    void makeSound() {
        System.out.println("멍멍");

    }
}

public class Main {

    public static void main(String[] args) {
        Animal dog = new Dog();

        dog.makeSound();
        dog.sleep();
        }
    }

