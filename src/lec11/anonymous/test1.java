package lec11.anonymous;

interface Greeting {
    void greet();
}


public class test1 {

    public static void main(String[] args) {
        Greeting greeting =new Greeting() {
            @Override
            public void greet() {
                System.out.println("Hello from the anonymous class!");

            }
        };

        greeting.greet();
    }

}
