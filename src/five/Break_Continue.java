package five;

public class Break_Continue {
//break 예시
    public static void main(String[] args) {
//        for (int i = 1; i <= 10; i++) {
//            if (i == 7) {
//                break;
//            }
//            System.out.println(i);
//        }
//    }
//continue 예시
        for (int i = 1; i <= 10; i++) {
            if (i % 3 != 0) {
                continue;
            }
            System.out.println(i);
        }
        }
}
