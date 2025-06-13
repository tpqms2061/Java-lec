package lec10.One;

import lec10.Public;

public class Animal {
    protected static String protectedFiled = "protected";


    public Animal() {
        System.out.println(Animal.protectedFiled);
        System.out.println(Public.publicFiled);

    }
}
