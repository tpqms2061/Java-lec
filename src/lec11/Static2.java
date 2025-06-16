package lec11;

class Person {

    int x;
    static int a;

    public static void great() {
        Person person = new Person();
        person.x= 3;

        a=2;

        System.out.println("static입니다");
    }

    public void greatinstance() {

        x =3;
        a = 2;

        System.out.println("인스턴스입니다.");
    }
}

public class Static2 {

    public static void main(String[] args) {
        Person.great();
//        Person.greatinstance(); //인스턴스 메서드 객체생성없이 접근 x

        Person p = new Person();
        p.greatinstance();
//        p.great // 클래스 메서드 객체로는 접근 x
    }
}
