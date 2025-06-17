package lec12.trycatch;

public class Throws2 {

    public static void main(String[] args) {
        String input = "100";

//        String[] tokens = input.split("기"); //input.split("a" ) 단어 a마다 나눠서 출력

//     for (String token : tokens) {
//           System.out.println(token);
//        }

        try {
            boolean result = validataTokenCount(input);

            if (result) {
                System.out.println("숫자 2개");
            }
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        }

    }

    public static boolean validataTokenCount(String tokens) throws NumberFormatException {

        if (tokens.length() != 2) {
            throw new NumberFormatException("숫자 2개가 아닙니다.");
        }

        return true;
    }
}

