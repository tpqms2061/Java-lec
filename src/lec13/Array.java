package lec13;

import java.util.*;

public class Array {

    public static void main(String[] args) {

        List<String> fruits = new ArrayList<String>(6);

        fruits.add("Apple");  //arry에 순차적으로 추가
        fruits.add("Banana");
        fruits.add("Tomato");
        fruits.add("Mango");
        fruits.add("Potato");
        fruits.add("Dragonfruit");

//        Collections.sort(fruits); //오름차순으로 정렬
//
//        for (String fruit : fruits) {
//            System.out.println(fruit);
//        }

//        for (int i = 0; i < fruits.size(); i++) {
//            System.out.println(fruits.get(i));
//        }

//        if (fruits.contains("KIWI")) {  //해당 요소가 포함되어있는지 확인 / 대소문자 완전히 일치해야됨 .equals로 로직이 되어있어서
//            System.out.println("KIWI는 포함되어있습니다");
//        }
//
//        if (fruits.contains("Apple")) {
//            System.out.println("포함");
//        }

//        fruits.remove("Tomato"); //값으로 삭제
//        fruits.remove(4); //인덱스로 삭제 (4번쨰 인덱스 삭제 )
//
//        for (String fruit : fruits) {
//            System.out.println(fruit);
//        }
//        System.out.println(fruits.isEmpty()); //비어있으면 true / 차있으면 false
//
//        fruits.clear(); // Array 초기화
//        System.out.println(fruits.size()); // Array 크기 확인
//
//        System.out.println(fruits.isEmpty());

//        int index = fruits.indexOf("Banan"); //해당 인덱스 출력 / 없으면 -1이 출력 //중복 시 앞에 것 출력
//        System.out.println(index);
//        System.out.println(fruits.indexOf("Banana"));


        fruits.set(1,"Orange"); //몇번째 인덱스를 다음으로 변경
        System.out.println(fruits.get(1)); //get을 통해 해당 인덱스 확인


        List<String> subFruits = fruits.subList(2, 4); //해당 Array 추출하여 새롭게 출력 마지막 4는 포함x

        for (String subFruit : subFruits) {
            System.out.print(subFruit+ " ");
        }

    }
}
