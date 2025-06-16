package lec11.InnerClass;

public class InnerGenerate {
    String outerMessage = "Hello for Outer";


    class Inner {
        void showMessage() {
            System.out.println(outerMessage);


        }
    }

    public static void main(String[] args) {
        InnerGenerate innerGenerate = new InnerGenerate();

        InnerGenerate.Inner inner = innerGenerate.new Inner();

        inner.showMessage();


    }
}
