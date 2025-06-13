package lec10.getter;

class Person {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}


public class Main {
    public static void main(String[] args) {

        Person person = new Person();

        person.setName("서승환");

        System.out.println(person.getName());
    }

}
