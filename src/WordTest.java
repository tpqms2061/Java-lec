import java.util.Locale;
import java.util.PrimitiveIterator;
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

    // C- 알파벳 o, 자리 o
    // W- 알파벳 o, 자리 x
    // N- 알파벳 x, 자리 x
    private static class Feedback {
        private final char[] resultSymbols;

        Feedback(char[] resultSymbols) {
            this.resultSymbols = resultSymbols;
        }

        boolean isAllCorrect() {
            for (char c : resultSymbols) {
                if (c != 'C') {
                    return false;
                }
            } // 단어 전부가 CCCCC가 아니라면 정답이 아니니까 false
            return true; // 그외는 CCCCC는 정답이니까 true
        }



        // ['C', 'W', 'N', 'C', 'C']
        // ""
        // "C"
        // "CW"
        // ...
        // "CWNCC" => sb는 첨에 "" 로 이루어져있따가 sb.append를 통해서 하나씩 연결하는거

        String getWordResultCheck() {  //StringBuiler -> 문자열을 효율적으로 연결하려고 //String 을 저장하려는 장소 -> 버퍼
            StringBuilder sb = new StringBuilder();

            for (char c : resultSymbols) {
                sb.append(c);
            }

            return sb.toString();
        }

    }

    private Feedback evaluateGuess(String guess, String answer) {
        char[] symbols = new char[WORD_LENGTH];
        int[] count = new int[26];

        //.toCharArray() : 배열을 단어로 변환
        for (char c : answer.toCharArray()) {
            count[c - 'A']++; //단어를 아스키 코드로 변환해서  A :65 B:66 에서 A 를 빼

            // [1, 0, ... 2, ..., 0]
            // "APPLE"
            // a 1증가
            // p
            // A - A = 0
            // B - A = 1
            // ...
            // Z - A = 25
        }
    }






}
