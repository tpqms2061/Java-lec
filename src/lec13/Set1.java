package lec13;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class Set1 {  /// set 순서가 없고 대소문자 구분이 없다 //무작위로 스택
    public static void main(String[] args) {
        Set<String> fruits = new HashSet<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("Aiwi");
        fruits.add("aiwi");

        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        System.out.println("");

        Iterator<String> it = fruits.iterator();
        while (it.hasNext()) {
            String item = it.next();
            System.out.println(item);
        }
    }


}
