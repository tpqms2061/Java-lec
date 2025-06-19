package lec14.generic1;

import java.util.Map;
import java.util.TreeMap;

class Map2{
    String key;
    Integer value;

    public Map2(String key, Integer value) {
        this.key = key;
        this.value=value;
    }
}


public class gMain1 {
    public static void main(String[] args) {
        Map2 map = new Map2("ABC", 123);


        Map<String, Integer> fruitPrices = new TreeMap<>(); //제네릭을 사용하면 위 과정을 쉽게 객체 생성가능
        //재네릭은
    }


}
