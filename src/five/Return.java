package five;

public class Return {

    public static int addNumber(int a, int b) {

        return a+b;
    }

    public static void main(String[] args) {

        int number = addNumber(10, 3); //return 값이 number에 등록됨
        System.out.println(number);

    }

}
