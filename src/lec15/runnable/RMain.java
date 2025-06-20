package lec15.runnable;


class MyRunnable implements Runnable { //Runnable 의 run()이 추상메서드 이기 떄문에 람다식이 가능
    @Override
    public void run() {
        System.out.println("Runnable 실행 중");

        for (int i = 1; i <= 5; i++) {
            try {
                Thread.sleep(5000);

                System.out.println(i);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

public class RMain {
    public static void main(String[] args) {
        Thread thread = new Thread(new MyRunnable(), "CountThread"); //객체 뒤에 명칭을 설정함으로써 set.Name을 따로 해줄필요 x

        //== thread.setName("CountThread");

        thread.start();

        System.out.println(thread.getName());
    }
}

//위에 것 람다식으로 변경
//public class RMain {
//    public static void main(String[] args) {
//        new Thread(()-> {
//            System.out.println("Runnable 실행 중");
//
//            for (int i = 1; i <= 5; i++) {
//                try {
//                    Thread.sleep(5000);
//
//                    System.out.println(i);
//                } catch (InterruptedException e) {
//                    System.out.println(e.getMessage());
//                }
//            }
//        }).start();
//    }
//}