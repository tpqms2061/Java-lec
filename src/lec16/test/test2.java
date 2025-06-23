package lec16.test;

public class test2 {
    public static int getProductAbs(int x, int y) {
        int sum = x*y;

        if (x * y >= 0) {
            return sum;
        } return -sum;


    }

    public static void main(String[] args) {
        System.out.println(getProductAbs(10, 20));
        System.out.println(getProductAbs(20,-40));
    }
}
