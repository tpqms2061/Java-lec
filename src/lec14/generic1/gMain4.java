package lec14.generic1;

import java.util.ArrayList;
import java.util.List;

class Box4 {
    public static <T> void displayArray(List<T> array) { //제네릭에 배열 설정
        for (T element : array) {
            System.out.println(element);
        }
    }
}

public class gMain4 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        List<String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("cherry");


        Box4.displayArray(fruits);
    }
}
//미션 배열 -> list 로 변경가능?
