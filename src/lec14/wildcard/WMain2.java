package lec14.wildcard;


import java.util.Arrays;
import java.util.List;

public class WMain2 {

    public static void printElement(List<?> list) {
        //여러타입을 수용할수있는 리스트를 만들고
        for (Object o : list) {
            System.out.println(o);
        }
    }
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3);
        List<String> words = Arrays.asList("A", "B", "C");

        printElement(numbers);
        printElement(words);

    }
}
