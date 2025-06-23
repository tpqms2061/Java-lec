package lec16.Anotation;


public class AMain2 {


    @SuppressWarnings({"rowtypes"})
    public static void main(String[] args) {
        java.util.List list = new java.util.ArrayList<>();

        list.add("Hello");
        list.add("World");

        for (Object object : list) {
            System.out.println(object);
        }

    }
}
