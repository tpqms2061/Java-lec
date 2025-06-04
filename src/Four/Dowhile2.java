package Four;

public class Dowhile2 {

    public static void main(String[] args) {

        int input =4;

        do {
            System.out.println("안녕하세요 자판기입니다");
            switch (input) {
                case 1:
                    System.out.println("콜라");
                    break;
                case 2:
                    System.out.println("사이드");
                    break;
                case 3:
                    System.out.println("물");
                    break;
                default:
                    System.out.println("잘못고름");
            }

        } while (input == 0);
    }
}
