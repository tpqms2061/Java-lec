package lec10;

import lec10.One.Animal;

public class Public {

    public static String publicFiled = "난 퍼블릭";


    public static void main(String[] args) {
        System.out.println(Animal.protected);


    }
}

class Child extends Public {

    public Child() {
        System.out.println(Public.publicFiled);

    }
}
