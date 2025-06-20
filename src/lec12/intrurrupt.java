package lec12;

public class intrurrupt {

    public static void main(String[] args) throws InterruptedException {

        Thread worker = new Thread(() -> {
            try {
                System.out.println("Worker: -> 작업 시작");
                Thread.sleep(10_000);//ms
            } catch (InterruptedException e) {
                System.out.println("Worker : 중단 신호 수신, 정리 작업후 종료");

            }

        });

    }
}
