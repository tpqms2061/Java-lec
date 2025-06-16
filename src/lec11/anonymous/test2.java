package lec11.anonymous;

interface Calculator {
    int compute(int a, int b);
}

public class test2 {
    public static void main(String[] args) {
        Calculator mul = new Calculator() {
            @Override
            publric int compute(int a, int b) {
                return a*b;
            }
        };

//        Calculator add = new Calculator() {
//            @Override
//            public int compute(int a, int b) {
//                return a+b;
//            }
//        };
//
//        Calculator sub = new Calculator() {
//            @Override
//            public int compute(int a, int b) {
//                return a-b;
//            }
//        };


        Calculator test = new Calculator() {
            @Override
            public int compute(int a, int b) {
                return Integer.parseInt("" + a + b);
            }
        };

        System.out.println(mul.compute(3, 4));
        System.out.println(add.compute(3, 4));
        System.out.println(sub.compute(3, 4));
        System.out.println(test.compute(3, 4));

    }
}
