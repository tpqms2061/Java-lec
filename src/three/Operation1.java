package three;

public class Operation1 {
    public static void main(String[] args) {
        int a = 10; //변수명 선택시 int /double 과 같은 변수타입은 안됨
        int b =3 ;  //가독성을 위해 int a =10 , b=3; 으로도 사용함
        //더하기
        int sum = a + b;
        System.out.println(sum);
        //빼기
        int difference = a - b;
        System.out.println(difference);

        //곱하기
        int product = a * b;
        System.out.println(product);

        //나누기
        int quotient =a / b;
        System.out.println(quotient);

        //나머지
        int remainer= a % b;
        System.out.println(remainer);

    }
}
