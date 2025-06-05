package five;

public class Unicode {

    public static void main(String[] args) {

        char asciiChar = 'A';
        System.out.println("Character : " + asciiChar);

        int asciiCode = (int) asciiChar; //Ascii코드로 변환
        System.out.println("asciiCode = " + asciiCode);

        char koreanChar = '가';
        System.out.println("Caracter = " + koreanChar);

        int unicodeCode = (int) koreanChar; //UniCode로 변환
        System.out.println("Unicode Code: U+" + Integer.toHexString(unicodeCode).toUpperCase());


    }
}
