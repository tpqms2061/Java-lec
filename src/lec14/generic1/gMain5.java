package lec14.generic1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Box5 {
    public static <T> void displayArray(List<T> array) { //제네릭에 배열 설정
        for (T element : array) {
            System.out.println(element);
        }
    }
}

public class gMain5 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5); // 이러면 값이 고정되어 add.remove가 되지않음
        numbers.add(6);

        List<String> words = new ArrayList<>(Arrays.asList("apple", "banana", "Cherry")); //위와 같음


        List<String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("cherry");


        Box4.displayArray(fruits);
    }
}
//미션 배열 -> list 로 변경가능?
