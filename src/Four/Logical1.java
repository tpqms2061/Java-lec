package Four;

public class Logical1 {

    public static void main(String[] args) {
        int age = 20;
        boolean hasID = true;

        if (age >= 18 && hasID) {
            System.out.println("접속가능");

        }
        boolean isWeekend = false;
        boolean isHoliday = true;

        if(isHoliday || isHoliday) {
            System.out.println("쉴수있습니다.");
        }

        boolean isRaining = true;
        if (!isRaining) {
            System.out.println("나가자");
        } else {
            System.out.println("우산");
        }

    }
}
