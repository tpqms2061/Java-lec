package six;

public class Array1 {

    public static void main(String[] args) {

          int[] numbers = {1, 2, 3, 4,5}; //배열의 방식  / 배열의 크기 : 5
//        String[] numbers = {1, 2, 3, 4, 5};  // 타입을 일치시켜야됨 String 인데 수가 오면 컴파일 에러

        System.out.println(numbers.length);

//        for (int i = 0; i < 5; i++) {
//            System.out.println(numbers[i]);
//        }

        for (int i = numbers.length-1; i >= 0; i--) {
            System.out.println(numbers[i]); // numbers.length 는 5인데 배열은 0~4이므로 -1 해줘야됨
        }

    }
}
