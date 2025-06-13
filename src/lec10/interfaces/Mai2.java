package lec10.interfaces;

interface Animal1{
    void makeSound();
}

class Dog1 implements Animal {

    
    public void makeSound() {
        System.out.println("멍멍!");
    }

    public void makeLoud() {
        System.out.println("으르러러렁");
    }

}



public class Mai2 {

    public static void main(String[] args) {
        Animal dog = new Dog();

        dog.makeSound();
        dog.makeLoud(); /
        if (dog instanceof Dog) {
            Dog1 newDog = new Dog1();
            newDog.makeLoud();
        }
    }
}
