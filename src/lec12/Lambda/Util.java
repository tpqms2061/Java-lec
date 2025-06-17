package lec12.Lambda;

public class Util {


    //메서드 참조
    class Utils {
        public static void sayHello(String name) {
            System.out.println("Hello, " + name);
        }
    }

    @FunctionalInterface
    interface A {
        public void say(String name);
    }

    public class Main {
        public static void main(String[] args) {
            A a = (name) -> Utils.sayHello(name);
            // A a = Util::sayHello; => 메서드 참조로 변환가능

            a.say("h662");
        }
    }

}