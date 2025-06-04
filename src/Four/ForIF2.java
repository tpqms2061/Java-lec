package Four;

public class ForIF2 {

    public static void main(String[] args) {

        for (int i = 1; i <= 20; i++) {
            if (i % 3 == 0) {
                System.out.println(i); //2 4 6 8 10
            }
        }

        for (int i = 20; i >= 1; i--) {
            if (i % 4 == 0) {
                System.out.println(i);
            }
        }
    }
}
