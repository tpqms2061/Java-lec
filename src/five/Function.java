package five;

public class Function {
    public static void printStudent(String name, int age) {
        System.out.println("이름: " + name);
        System.out.println("나이: " + age);
        System.out.println("-------------");

    }

    public static void main(String[] args) {
        System.out.println("=== 학생 정보 출력===");
        printStudent("Alice", 20);
        printStudent("Bob", 22);
        printStudent("smith", 25);
    }
}
