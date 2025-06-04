package three;
 //복합연산자
public class Operation2 {
    public static void main(String[] args) {
        int a =10 , b =3 ;

        a += 5; // a = a +5;
        System.out.println(a);

        b -= 1;  //b = b-1;
        System.out.println(b); //2

        b*=2; //b= b*2;
        System.out.println(b); //2*2

        b /= 2; //b = b/2;
        System.out.println(b); // 4/2

        b%= 2; //b = b%2;
        System.out.println(b); // 2%2 = 0

    }

}
