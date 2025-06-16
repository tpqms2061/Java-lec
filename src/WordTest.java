import java.util.Random;
import java.util.Scanner;

public class WordTest {

    private static final String WORD_LIST[] = {
            "APPLE", "BRAIN", "CRANE", "DREAM", "EAGLE",
            "FRAME", "GRACE", "HOUSE", "INPUT", "JUDGE"};
    // static 메모리에 할당시켜서 항상 쓰게끔  //final 단어들 고정
    private static final int MAX_ATTEMPTS = 6;  //시도횟수
    private static final int WORD_LENGTH =5;

    public static void main(String[] args) {

//        Scanner scanner = new Scanner(System.in);
        String answer = pickRandomWord();
        System.out.println("정답(디버그용):" + answer);

    }

    public static String pickRandomWord() {
        Random rand = new Random();
        return WORD_LIST[rand.nextInt(WORD_LIST.length)]; // bound:10 의 뜻은 0~9 까지의 값을 랜덤하게 출력
    }






}
