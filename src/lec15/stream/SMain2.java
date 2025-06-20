package lec15.stream;

import java.util.Arrays;
import java.util.List;

public class SMain2 {
    public static void main(String[] args) {

        List<Double> values = Arrays.asList(10.0, 20.0, 30.0);


        double avg = values.stream()
                .mapToDouble(Double::doubleValue)
                .average()                          //orElse가 없으면 컴파일 에러
                .orElse(0.0);                   //평균을 구할때 안전장치를 구해야됨
                                                        //리스트가 없는 경우 0으로 나누게 되니까 그럴경우를 대비해서 결과값을 0.0출력하도록

        System.out.println(avg);

    }


}
