package lec13;

import java.util.HashMap;
import java.util.Map;

public class Map1 {
    public static void main(String[] args) {

        Map<String, Integer> fruitPrices = new HashMap<>();

        fruitPrices.put("Apple", 2500);
        fruitPrices.put("Banana", 2000);
        fruitPrices.put("Strawberry", 10000);
        fruitPrices.put("Watermelon", 20000);

        for (Map.Entry<String, Integer> entry : fruitPrices.entrySet()) {
            System.out.println("상품명: " + entry.getKey() + " costs: " + entry.getValue() + "원.");
        } //전체 키값 순회

        for (int fruitPrice : fruitPrices.values()) {

            System.out.println(fruitPrice);
        }// 값 순회 : int

        System.out.println(fruitPrices.size());; // map 갯수 출력

        int sum = 0;
        int avg= 0;
        for (int fruitPrice : fruitPrices.values()) {

            sum += fruitPrice;
            avg = sum / fruitPrices.size();

        }// 값 순회 : int
        System.out.println(avg);
        ;


    }
}
