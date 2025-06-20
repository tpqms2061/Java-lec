package lec15.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class SMain {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        int result= numbers.stream()
                .filter((n) -> n % 2 == 0) //    // 해당 람다식의 값만 남기고 전부 삭제
                .mapToInt(x -> x.intValue()) //Integer 를 int 형으로 바꿔 처리
                //Stream<Integer> -> IntStream 으로 변경
                .sum();  //최종연산으로 마지막부분에 들어가야됨
        
        
        //for문
        for(int n : numbers){
            if(n % 2 ==0){
                System.out.println(n);
            }
        }
            




        String[] x ={"a", "b" };
        Stream<String> stream1 = Arrays.stream(x); //배열은 리스트로 변경하고 스트림해야됨


    }
}
