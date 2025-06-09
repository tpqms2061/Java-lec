package six;

public class StringMethod {
    public static void main(String[] args) {

        String message = "Hello, Java!";

        System.out.println(message);

        System.out.println(message.length());

        System.out.println(message.toUpperCase());  //전부 대문자 표시
        System.out.println(message.toLowerCase()); //전부 소문자 표시

        System.out.println(message.indexOf("J")); //해당 문자가 몇번째 인덱스에 있는지 확인
        System.out.println(message.indexOf("l"));  //중복된 숫자 입력시 처음 문자 인덱스 출력하고 종료


        for (int i = 0; i < message.length(); i++) {
            if (message.charAt(i) == 'l') {
                System.out.println(i);
                break;
            }
        }//message.charAt(i) : 메시지의 몇번째 단어

        System.out.println(message.substring(1)); //substring(x) : x번째 인덱스부터 출력

        String address = "0x120819f5573ac3A530e6172b1581613A09b4b338";
        System.out.println(address.substring(0,7));
        System.out.println(address.substring(address.length()-5));


    }
}
