package lec12.Lambda;

@FunctionalInterface
interface Operation2 {
    int apply(int x);

}

@FunctionalInterface
interface Operation3 {
    int operate2(int a, int b);

}

public class LMain2 {

    public static void main(String[] args) {
        Operation2 square =x->  x*x; //변수가 하나일경우에는 () 생략가능
        System.out.println(square.apply(7));

        Operation3 add = (a, b) -> a+b;
        System.out.println(add.operate2(3,4));
        ;


    }



}
