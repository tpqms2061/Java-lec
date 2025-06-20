package lec15.Thread;

class MyThread extends Thread {  //Thread 상속
    @Override //run은 일반 메서드 실행 //start는 쓰레드 실행
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("My Thread :" + i);


            try {
                Thread.sleep(5000); //sleep문은 쓰레드가 멈추는 시간으로 try-catch문에 같이 작성해야됨

            } catch (InterruptedException e) { //interruptedException 이 발생하는 이유 : sleep설정해놨는데 다른 쓰레드가 쓰레드 깨울때
                System.out.println("누가 깨웠어?");

            }

        }

    }
}

public class TMain {

    public static void main(String[] args) {

        MyThread myThread = new MyThread();
        myThread.start(); //sout 문 실행되고 run 실행

        myThread.run();// run 실행될동안 sout 문 실행 x

        System.out.println("나를 막지마"); //실행되고 run 실행





    }
}
