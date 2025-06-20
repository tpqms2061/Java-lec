package lec14.generic1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

class Box3 {
    public static <T> void displayArray(T[] array) { //제네릭에 배열 설정
        for (T element : array) {
            System.out.println(element);
        }
    }
}

public class gMain3 {
    public static void main(String[] args) {

        Integer[] number = {1, 2, 3, 4, 5};
        String[] fruits = {"사과", "바나나", "포도", "배", "청포도"};

        Box3.displayArray(number);
        Box3.displayArray(fruits);
    }
}
//미션 배열 -> list 로 변경가능?
