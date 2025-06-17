package lec12.Lambda;

@FunctionalInterface //추상적 메서드는 오직 한개만 설정 가능
interface MathOperation{

    int operate(int a, int b);


}


public class LMain {

    public static void main(String[] args) {

        MathOperation add = (a,b)  -> a+b;
        MathOperation multi = (a, b)  -> a*b;

        System.out.println(add.operate(2, 4));
        System.out.println(multi.operate(2, 4));



    }
}
