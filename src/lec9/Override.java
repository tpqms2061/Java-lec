package lec9;

class Animal1 {
    String name;

    public Animal1(String name) {
        this.name = name;
    }

    public void printName() {
        System.out.println("이름: " + name);
    }
}

class Dog1 extends Animal1 {
    String breed;

    public Dog1(String name, String breed) {
        super(name);
        this.breed = breed;
    }
    public void printName() {
        System.out.println("이름: " + name + ", 종: " + breed);
    }
}


public class Override {

    public static void main(String[] args) {
        Dog1 dog = new Dog1("이월", "chiwawa");
        dog.printName();


    }


}
//
//Animal dog = new Dog1("이월", "chiwawa");
// if (dog instanceof Dog1) {
//Dog1 newDog = (Dog1) dog;
//
//            newDog.printName();
//        }
