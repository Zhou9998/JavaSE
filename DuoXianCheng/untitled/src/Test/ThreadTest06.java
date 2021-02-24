package Test;

public class ThreadTest06 {
    public static void main(String[] args) {
        MyRunnable1 m = new MyRunnable1();
        Thread t = new Thread(m);
        t.start();
        for (int i = 0; i < 10000; i++) {
            try {
                t.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(i);
        }
    }
}

class MyRunnable1 implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            System.out.println("i = " + i);
        }
    }
}
