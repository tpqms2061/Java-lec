class Outer {
    static class StaticInner {
        void hello() {
            System.out.println("hello");

        }
    }
}



public class Static {
    public static void main(String[] args) {
        Outer.StaticInner inner = new Outer.StaticInner();
        inner.hello();
    }

}
