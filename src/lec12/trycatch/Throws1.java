package lec12.trycatch;

public class Throws1 {

    public static void main(String[] args) {

        String strNum = "123";
        try {
            int num = convertToInt(strNum);

            System.out.println("변환 결과: " + num);


        } catch (NumberFormatException e) {

            System.out.println("숫자 형식 오류");
        }// catch 중첩해서도 가능 NumberFormatexcepetion 과 겹치지 않는 에러의 경우 중첩해서 catch문 작성


    }

    public static int convertToInt(String s) throws NumberFormatException {
        return Integer.parseInt(s);
    }
}
