package three;
//증감 연산자
public class Operation3 {
    public static void main(String[] args) {

        //전위형 (++a) -> 먼저 증가시키고 로직 진행
        //후위형( a++) -> 로직 진행 후 증가

        int a =10 ,b =3;
        //전위형

        System.out.println(++a);
        System.out.println(--b);

        //후위형

        System.out.println(a++);
        System.out.println(b--);
        System.out.println(a);
        System.out.println(b);
    }

}
