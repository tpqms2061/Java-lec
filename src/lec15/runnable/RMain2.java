package lec15.runnable;

class SumRunnable implements Runnable {
    private final int [] numbers;  //값 초기화가 되지않아 컴파일 에러뜸

    public SumRunnable(int[] numbers) {
        this.numbers = numbers;
    }

@Override
    public void run() {
        int sum = 0;

    for (int n : numbers) {
        sum += n;

        try {
            Thread.sleep(1000);

        } catch (InterruptedException e) {
            System.out.println("Thread Interrpted");
        }
    }
    System.out.println(Thread.currentThread().getName() + "- Sum:" + sum);
    }
    //Thread.currentThread().getName() 현재 실행중인 쓰레드 이름 불러오기
}

public class RMain2 {

    public static void main(String[] args) {

        int [][] dataset = {
                {1,2,3,4,5},
                {10,20,30},
                {700000,10000004,2001,20008},
                {1000,2000,3000,4000}
        }; //별도의 쓰레드가 진행하는데 갯수가 작은거부터 완료되서 출력되서 순서가 다르며 개수는 같으면 cpu에 올라가는 순서대로 출력

        for (int i = 0; i < dataset.length; i++) {
            Thread sumThread = new Thread(new SumRunnable(dataset[i]));

            sumThread.start();
        }

        System.out.println("All Threads started");

    }
}
