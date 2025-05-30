//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int age = 25;
        System.out.println(age);

       age=26;

        System.out.println(age);

        int salary = (int) 50000.75; //강제 형변환
        System.out.println(salary);

        char name = 'a';
        System.out.println(name);

        String name2 = "홍성현";
        System.out.println(name2);

        System.out.println(name2.length()); //이름의 글자수 호출
    }
}