package lec12.finall;

public class fMain2 {
    public static void main(String[] args) {
        String num1 = "123a";

        try {
            int num2 = Integer.parseInt(num1);
            System.out.println("Parse number : " + num2);

        } catch (NumberFormatException E) {
            System.out.println("Error : Unable to parse the input");

        }finally {
            System.out.println("Process completed."); //에러되어도 반드시 실행
        }

    }




}
