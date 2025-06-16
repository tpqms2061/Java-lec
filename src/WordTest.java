import java.util.Locale;
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

        Scanner scanner = new Scanner(System.in);
        String answer = pickRandomWord();
        System.out.println("정답(디버그용):" + answer);

        System.out.println("=== Wordle 게임 ===");
        System.out.println("5글자 단어를 맞춰보세요 . 총 6번의 기회가 있습니다");
        System.out.println("C: 정확한 위치, W: 단어에는 있으나 위치 불일치, N: 단어에 없음");

        for (int attempt = 1; attempt <= MAX_ATTEMPTS; attempt++) {
            String guess;

            while (true) {
                System.out.print("\n[" + attempt + "/" + MAX_ATTEMPTS + "] 추측>");
                guess = scanner.nextLine().trim().toUpperCase(); //trim() : 내 가  뛴 다 이런식으로 입력시 글자와 글자 사이 공백제거 => 내가뛴다
                if (guess.length() == WORD_LENGTH) {
                    break;
                }
                System.out.println("5글자 단어를 입력하세요.");
            }

            System.out.println("남은 시도횟수 : " + (MAX_ATTEMPTS-attempt) + ", 입력한 단어 : " + guess);

        }
    }

    public static String pickRandomWord() {
        Random rand = new Random();
        return WORD_LIST[rand.nextInt(WORD_LIST.length)]; // bound:10 의 뜻은 0~9 까지의 값을 랜덤하게 출력
    }






}
