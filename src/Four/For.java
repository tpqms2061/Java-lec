package Four;

public class For {

    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }

        //5단 실행
        int number =5;
        for (int i = 1; i <= 9; i++) {
            System.out.println(number+"*"+ i+"=" + number*i);
        }
        for (int i = 1; i <= 19; i++) {
            if (i >= 5) {
                System.out.println(number+"*"+ i+"=" + number*i);
            }
        }

       //구구단 실행
        for (int i = 1; i <= 9; i++) {
            System.out.println("구구단 "+ i + "단");
            for (int j = 1; j <= 9; j++) {
                System.out.println(i + " x " + j + " = " + (i*j));
            }

        }
    }

}
