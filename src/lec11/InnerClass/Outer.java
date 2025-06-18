package lec11.InnerClass;

public class Outer {

    private String message = "Hello form outer class. ";


    class InnerClass {
        void displaymessage() {
            System.out.println("Inner says: " + message);

        } //같은 클래스 내부에 있으므로 InnerClass는 클래스 내부의 멤버로 인식해 private에 접근가능
    }

    public void callInner() {
        InnerClass inner = new InnerClass();
        inner.displaymessage();
    }

    public static void main(String[] args) {
        Outer outer = new Outer();

        outer.callInner();
    }
}
