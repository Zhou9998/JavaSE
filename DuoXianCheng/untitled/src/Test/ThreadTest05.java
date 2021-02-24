package Test;

public class ThreadTest05 {
    public static void main(String[] args) {
        MyRunnable m = new MyRunnable();
        Thread t = new Thread(m);
        t.start();
        boolean run = true;
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t.stop();
        m.run = false;
    }
}

class MyRunnable implements Runnable{
    boolean run = true;
    @Override
    public void run() {
        if (run){
            for (int i = 0; i < 10; i++) {
                System.out.println("i = " + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }else return;
    }
}