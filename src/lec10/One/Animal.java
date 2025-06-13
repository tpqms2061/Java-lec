package lec10.One;

import lec10.Public;

public class Animal {
     static String defaultFiled = "default";


    public Animal() {
        System.out.println(Animal.defaultFiled);
        System.out.println(Public.publicFiled);

    }
}
