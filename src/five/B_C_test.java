package five;

public class B_C_test {
    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++) {
            if (i % 5== 0) { //5배 배수 출력X
                continue;
            }
            if (i >= 15) { //15이상 출력 X
                break;
            }
            System.out.println(i);
        }
    }
}
