package lec12.trycatch;

public class tMain {

    public static void main(String[] args) {

        int a = 10;
        int b = 0;


        try { //에러 발생하지 않을 시에는 try 문 실행
            int result = a / b;
            System.out.println("Result: " + result);

        } catch (ArithmeticException e) { //에러가 발생하면 catch 문 실행
            System.out.println(e);
            System.out.println(e.getMessage()); //인스턴스에 저장된 메세지
            e.printStackTrace(); //예외 발생당시의 메서드 정보와 예외 메시지
            System.out.println(e.toString());


            System.out.println("Error : Division by zero");
        }

    }
}
