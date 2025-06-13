package lec10.polymorphism;

class Animal {
    public void makeSound() {
        System.out.println("동물소리");
    }
}

class Dog extends Animal {
    public void makeSound() {
        System.out.println("왈왈");
    }
}


class Cat extends Animal {
    public void makeSound() {
        System.out.println("냐옹");
    }
}

class Bird extends Animal {
    public void makeSound() {
        System.out.println("쨱쨱");
    }
}

public class Main {

    public static void main(String[] args) {

        Animal a1 = new Dog();
        Animal a2 = new Cat();
        Animal a3 = new Bird();
        a1.makeSound();
        a2.makeSound();
        a3.makeSound();

        Animal[] animals = {a1, a2, a3};

        for (int i = 0; i < animals.length; i++) {
            animals[i].makeSound();
        }//for each 문
    }

}
