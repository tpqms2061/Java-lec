package three;

public class Switch {

    public static void main(String[] args) {
        String mood = "tired";

        switch (mood) {
            case "happy":
                System.out.println("행복");
                break;

            case "tired":
                System.out.println("피곤");
                break;
            case "angry":
                System.out.println("화남");
                break;
            default:
                System.out.println("무감정");
            }
        }
    }

