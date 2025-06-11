package eight;

import java.util.Scanner;

public class Calcuration {

    public static void main(String[] args) {

        System.out.println(  " ==계산기 시작 == " );

        Scanner scanner = new Scanner(System.in);

        System.out.println("첫번째 숫자 입력하세요");
        double firstNumber = scanner.nextDouble();

        System.out.println("연산을 입력해주세요 (+, -, *, / )");
        char opertaion = scanner.next().charAt(0);

        System.out.println("두번째 숫자 입력해주세요");
        double secondNumber = scanner.nextDouble();


        double result =0;

        switch (opertaion) {
            case '+':
                result = firstNumber + secondNumber;
                break;
            case '-':
                result = firstNumber - secondNumber;
                break;
            case '*':
                result = firstNumber * secondNumber;
                break;
            case '/':
                if (firstNumber == 0 || secondNumber==0) {
                    System.out.println("0으로 나눌수 없습니다.");
                    return;
                }else{
                    result = firstNumber / secondNumber;
                    break;
                }
            default:
                System.out.println( "잘못된 선택입니다");
                return;
        }
        System.out.printf("계산 결과는: %.02f\n",result );
        System.out.println("계산종료합니다");

    }

}




