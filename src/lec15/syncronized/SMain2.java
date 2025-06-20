package lec15.syncronized;

class Counter2 {
    private int count =0;

    public synchronized void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }
}

public class SMain2 {
    public static void main(String[] args) throws InterruptedException{


        Counter2 counter = new Counter2();

        Runnable task = ( ) -> {                //쓰레드 로직만 생성
            for (int i = 0; i < 10000; i++) {
                counter.increment();
            }
        };

        Thread[] threads = new Thread[5]; //쓰레드  배열 5개 생성 /안에 배열 x
        for (int i = 0; i < 5; i++) {
            threads[i] = new Thread(task); //for문을 통해 안에 내용들 설정
            threads[i].start();
        }

        for (Thread t : threads) {
            t.join();
        }

        System.out.println("Final count :" + counter.getCount());

    }
}
