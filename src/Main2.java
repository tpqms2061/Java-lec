public class Main2 {

    public static void main(String[] args) {
        double salary = 55000.75;

        int bonus = 5000;

        int totalSalary = salary + bonus;

        double totalSalary = salary + bonus; //자동 형변환

        System.out.println(totalSalary);

        int totalSalary2 = (int) salary + bonus; // 명시적 형변환

        System.out.println(totalSalary2);

    }
}
