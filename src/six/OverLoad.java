package six;

public class OverLoad {

    public static int add(int a, int b) {
        return a+b;
    }

    public static int add(int a, int b, int c) {
        return a+b+c;
    } //오버로딩 -> 매개변수 타입 및 변수를 다르게 해야됨

    public static void main(String[] args) {
        System.out.println("a+b  = " + add(1, 2));
        System.out.println("a+b+c  = " + add(3,4,5));



    }

}
