package lec12.Lambda;

import java.util.Arrays;

public class LMain3 {
    public static void main(String[] args) {
        String[] name = {"승환", "김백기","홍성현", "고종우"};

//        for (String n : name) {
//            System.out.println(n);
//
//        }//for-each 문 배열의 for문

        Arrays.stream(name).forEach(n -> System.out.println(name)); //배열관련된 기능들 Arrays = Random , Math
        Arrays.stream(name).forEach(n -> System.out.println(n)); //배열관련된 기능들 Arrays = Random , Math

        Arrays.stream(name).forEach(System.out::println); // 메서드 참조

    }

}
