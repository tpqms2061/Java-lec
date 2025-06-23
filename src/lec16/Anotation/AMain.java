package lec16.Anotation;


class Calculator {


    // 위 주석안에 소스코드에 대한 설명이 있고 , 그안에 @이 붙은 태그들을 이용해서 주석안에 정보 저장한다

    @Deprecated   //코드가 변경되었을 때나 사용되지 않은 코드에 표시  //사용하지말라고 경고가 뜸 노란색 표시
    public int add(int a, int b) {
        return a + b;
    }

    /**
     * 두수를 더합니다
     *
     * @param a 첫번째 정수
     * @param b 두번째 정수
     * @return 두수의 합
     */

    public int addNumber(int a, int b) {
        return a + b;
    }



}


public class AMain {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();


        System.out.println(calculator.add(1, 2));
        System.out.println(calculator.addNumber(2, 4));



    }
}

