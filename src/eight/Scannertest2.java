package eight;


import java.util.Scanner;

public class Scannertest2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.println(" === 자판기 메뉴 ===");
        System.out.println(" 1. 멜론소다 (800원) ");
        System.out.println(" 2. 콜라 (1300원) ");
        System.out.println(" 3. 닥터페퍼 (1000원) ");
        System.out.println(" 4. 환타 (1000원) ");

        int choice = scanner.nextInt();
        String item;
        int price;


        //입력한 값에 따른 조건문 //if 문 (숫자를 비교), 스위치 (수체크)

        switch (choice) {
            case 1:
                item = "멜론소다";
                price = 800;
                break;

            case 2:
                item = "콜라";
                price = 1300;
                break;

            case 3 :
                item = "닥터페퍼";
                price =1000;
                break;

            case 4:
                item = "환타";
                price =1000;
                break;
            default:
                System.out.println("잘못 골랐습니다 다시 고르세요");
                return; // 메인메소드를 탈출하는것
        }

        System.out.println("선택하신 음료는 :"+ item+ "/ 가격은 :" + price + "입니다."); //return 시 실행안됨

        int money = scanner.nextInt();

//        if (money - price > 0) {
//            int change = money-price;
//            System.out.println("남은 금액은: " + change+"입니다.");
//        }else{
//            System.out.println("금액이 부족합니다. 부족한 돈을 투입해주세요");
//        }

        while (money - price < 0) {
            System.out.println("금액이 부족합니다. 금액을 추가해주시기 바랍니다.");
            int addMoney = scanner.nextInt();
            money += addMoney;
        }
        if (money - price > 0) {
            int change = money - price;

            System.out.println("남은 금액은: " + change+"입니다.");
        }
        }
}


