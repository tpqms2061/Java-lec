package lec14.wildcard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WMain3 {

    public static double sumList(List<? extends Number> list ) { //와일드카드 확장이 number까지만 확장이 되도록 제약
        double sum= 0;

        for (Number n : list) {
            sum += n.doubleValue();
        }
        return sum;
    }

    public static void main(String[] args) {

        List<Integer> arr = Arrays.asList(10, 20, 30);
        List<Double> doublelist = Arrays.asList(0.1, 0.2);
        System.out.println("합꼐는:" +sumList(arr));
        System.out.println("합꼐는:" +sumList(doublelist));

    }
}
