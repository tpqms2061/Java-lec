package lec16.parallel;

public class SumThread extends Thread {
    private int[] array;
    private int start, end;
    private int partialSum= 0 ;

    public SumThread(int[] array, int start, int end) {
        this.array = array;
        this.end = end;
        this.start = start;
    }

    @Override
    public void run() {
        for (int i = start; i < end; i++) {
            partialSum += array[i];
        }
    }

    public int getPratialSum() {
        return partialSum;

    }

    public static void main(String[] args) {
        int [] numbers = new int[100];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i+1;
        }

        int numTreads = 4;
        int chunkSize = numbers.length / numTreads; //쓰레드 분할 준비

        SumThread[] threads = new SumThread[numTreads];

        for (int i = 0; i < numTreads; i++) {
            int start = i * chunkSize;
            int end = (i == numTreads - 1) ? numbers.length : start + chunkSize;
            //배열 길이가 4의 배수가 아닐 경우를 대비해서 마지막 i값에 대해 삼항연산자로 처리를 했군요
            //(ex: 101개일 경우 25개, 25개, 25개, 26개로 나눔)

            threads[i] = new SumThread(numbers, start, end);
            threads[i].start();
        }  //쓰레드 분할처리

        int totalSum = 0;
        try {
            for (SumThread thread : threads) {
                thread.join();

                int threadResult = thread.getPratialSum();

                totalSum += threadResult;

            }
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted:" + e.getMessage());

        }

        System.out.println("모든 쓰레드의 총합:" +totalSum);
    }



}
