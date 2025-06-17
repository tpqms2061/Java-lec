package lec12.trycatch;

public class NumberFormat {

    public static void main(String[] args) {
        String input = "123a";

        try {
            int number = Integer.parseInt(input); //파싱  // 123a 가 int 형으로 나오지 않기때문에 NuberFormatExceotion 발생
            System.out.println("당신이 입력한 숫자는 : " + number + "입니다,");

        } catch (NumberFormatException e) {
            System.out.println("숫자 포맷이 아닙니다.");
        }

    }
}
