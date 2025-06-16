package lec11.InnerClass;

class Outer {
    private class HiddenInner {
        void secret() {
            System.out.println("private!");

        }
    }

    public void reveal() {
        HiddenInner hi = new HiddenInner();
        hi.secret();
    }
}


public class Inner2 {
    public static void main(String[] args) {
        Outer outer = new Outer();

//        outer.secret(); // Private로 외부에서 접근  X

    }
}
