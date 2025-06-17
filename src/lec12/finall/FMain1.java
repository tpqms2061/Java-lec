package lec12.finall;

public class FMain1 {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;

        try {
            int result = a/ b;

            System.out.println("Result:" +result);

        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero.");
        }finally {
            System.out.println("Clearup: 이 블록은 항상 실행");//애로ㅓ
        }
    }

}
