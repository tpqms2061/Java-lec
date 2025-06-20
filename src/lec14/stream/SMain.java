package lec14.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class SMain {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        numbers.stream().filter((n) -> n % 2 == 0); // 해당 람다식의 값만 남기고 전부 삭제





        String[] x ={"a", "b" };
        Stream<String> stream1 = Arrays.stream(x); //배열은 리스트로 변경하고 스트림해야됨


    }
}
