package lec10;

public class Public {

    public static String publicFiled = "난 퍼블릭";


    public static void main(String[] args) {
        System.out.println(publicFiled);


    }
}

class Child extends Public {

    public Child() {
        System.out.println(Public.publicFiled);

    }
}
