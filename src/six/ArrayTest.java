package six;

public class ArrayTest {

    public static void main(String[] args) {

        int[] array = {2, 4, 6, 8, 10};
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];


        }
        System.out.println(sum);

    }
}
