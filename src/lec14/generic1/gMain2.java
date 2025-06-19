package lec14.generic1;

class Box<T>{
    private T content;

    Box(T content) {
        this.content = content; //제네릭 생성자
    }

    public T getContent() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }// set / get 제네릭

    public <E> void printcontent(E extraInfo) {
        System.out.println("Content: " + content+ ", Extra :" + extraInfo);
    }
}

class StringBox{
    private String content;

    public StringBox(String content) {
        this.content= content;//일반 생성자
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}

public class gMain2 {
    public static void main(String[] args) {
        Box<String> stringBox = new Box<>("나는 커서 휼륭하게 ");

        System.out.println(stringBox.getContent());

        stringBox.setContent("나트륨");
        System.out.println(stringBox.getContent());

        stringBox.printcontent("밀가루");
    }

}
