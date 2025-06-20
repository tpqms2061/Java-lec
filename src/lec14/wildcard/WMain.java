package lec14.wildcard;

import java.util.ArrayList;
import java.util.List;

public class WMain {

    public static void main(String[] args) {
        Object[] arr = new Integer[3]; //배열은 공변 // 내부에서 다른 타입으로 변경하면 런타임 오류

        //arrayList 로 변경
        //List<Object> list = new ArrayList<Integer>();
        //제네릭은 불공변이므로 컴파일시 오류됨, List<Integer>가 List<Object> 하위타입이 아님

        List<? extends Number> arr1 = new ArrayList<Integer>();
        // Number를 상속한 어떤 타입이든 가능함

        arr[1] = "Hello";
    }
}
