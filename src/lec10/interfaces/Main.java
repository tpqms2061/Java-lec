package lec10.interfaces;

interface Animal{
    void makeSound();
}

class Dog implements Animal {


    public void makeSound() {
        System.out.println("멍멍!");
    }
}

public class Main {

    public static void main(String[] args) {
        Dog dog = new Dog();

        dog.makeSound();
    }
}
