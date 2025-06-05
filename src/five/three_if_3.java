package five;

public class three_if_3 {

    public static void main(String[] args) {

        String color = "빨강";

        String choiceColor = (color == "빨강") ? "빨강": (color =="파랑") ? "파랑" : "보라";

        //False 일시 다음 조건에서 참 True/false 확인

        if (color == "빨강") {
            System.out.println("빨강");
        } else if (color == "파랑") {
            System.out.println("파랑");

        }else {
            System.out.println("보라");
        }

        System.out.println(choiceColor);

    }
}
