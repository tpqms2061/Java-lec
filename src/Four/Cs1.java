package Four;

public class Cs1 {

    public static void main(String[] args) {
        int number =1234567;

        String binaryString = Integer.toBinaryString(number); // 2진법 변환
        String hexString = Integer.toHexString(number); //16진수로 변환

        System.out.println("Demical:" +  number); //10진수 number 출력
        System.out.println("Binary:" + binaryString);
        System.out.println("hexn:" + hexString);

    }

}
