package lec13;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Set3 {

    public static void main(String[] args) {

//        Set<String> fruits = new LinkedHashSet<>();
        Set<String> fruits = new TreeSet<>(); //트리셋 : 순서  o 작은값-> 큰값순으로 저장
        //링크드 해쉬셋: 순서보장


        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Apple");

        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        if (fruits.contains("Apple")) {
            System.out.println("포함");
        }
    }
}
