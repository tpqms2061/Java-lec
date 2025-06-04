package three;

public class Final2 {
    public static void main(String[] args) {
        final int DAY_IN_WEEK = 7;
        final double PI = 3.14159;
        final String GREETING = "Hello, world";


        System.out.println("Days in a week:  " + DAY_IN_WEEK);
        System.out.println("Value of PI : " + PI);
        System.out.println("Greeting :" + GREETING);

        //error;
        //DAY_IN_WEEK = 8; // 상수로 에러 발생

    }


}
