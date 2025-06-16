package lec11.inner3;

public class Outer {
    private String data = "Outer data";

    class Inner {
        void printData() {
            System.out.println(data);
        }
    }

    public Inner createInner() {
        return new Inner();
    }


    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner inner = outer.createInner();

        inner.printData();
        outer =null;
        inner.printData();
        inner = null;
        System.gc();
    }


}
