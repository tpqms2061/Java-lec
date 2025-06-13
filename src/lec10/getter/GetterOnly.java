package lec10.getter;

//읽기전용
class ReadOnlyStudent {
    private int score;


    public ReadOnlyStudent(int score) {
        this.score = score;
    }

    public int getScore() {
        return score;
    }
}

public class GetterOnly {
    public static void main(String[] args) {
        ReadOnlyStudent ros = new ReadOnlyStudent(99);

        System.out.println(ros.getScore());
    }
}
