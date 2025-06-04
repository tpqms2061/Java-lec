package Four;

public class Compare {

    public static void main(String[] args) {

        int a = 10;
        int b = 7;

        System.out.println("a == b: " + (a==b) ); //false
        System.out.println("a != b: " + (a!=b) ); //true

        System.out.println("a> b :" + (a > b)); //true
        System.out.println("a< b :" + (a < b)); //false
        System.out.println("a>= 10 :" + (a >= b)); //true
        System.out.println("a<= 5 :" + (a <= b)); //false
    }
}
