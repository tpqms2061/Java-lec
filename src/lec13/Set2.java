package lec13;

import java.util.HashSet;
import java.util.Set;

public class Set2 {

    public static void main(String[] args) {

        Set<String> fruits = new HashSet<>();

        fruits.add("Apple");
        fruits.add("Banana");

        for (String fruit : fruits) {
            System.out.println(fruit.hashCode()); //해시코드확인
        }
    }
}
