import java.util.Scanner;

public class Scannertest3 {
    public static void main(String[] args) {
        final String COLA = "코카콜라";
        final String CIDER = "사이다";
        final String WATER = "에비앙";

        final int COLA_PRICE = 800;
        final int CIDER_PRICE = 1500;
        final int WATER_PRICE = 2000;

        Scanner scanner = new Scanner(System.in);

        System.out.println("=== 자판기 메뉴 ===");
        System.out.printf("1. %s (%d원)\n", COLA, COLA_PRICE);
        System.out.printf("2. %s (%d원)\n", CIDER, CIDER_PRICE);
        System.out.printf("3. %s (%d원)\n", WATER, WATER_PRICE);

        String choice = scanner.nextLine();
        int price = 0;
        String item = "";

        switch (choice) {
            case COLA:
                item = COLA;
                price = COLA_PRICE;
                break;
            case CIDER:
                item = CIDER;
                price = CIDER_PRICE;
                break;
            case WATER:
                item = WATER;
                price = WATER_PRICE;
                break;
            default:
                System.out.println("잘못된 선택입니다.");
                return;
        }

        System.out.println(item + "을(를) 선택하셨습니다. 금액을 넣어주세요: ");
        int money = scanner.nextInt();

        if(money < price) {
            System.out.println("금액이 부족합니다. 거래를 취소합니다.");
        } else {
            int change = money - price;
            System.out.printf("%s을(를) 드립니다. 잔돈은 %d입니다.\n", item, change);
        }

        System.out.println("빠이빠이");
    }
}