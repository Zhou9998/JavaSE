package Test;

public class ThreadTest02 {
    public static void main(String[] args) {

        Thread t = new Thread(new User());
        t.start();
        for (int i = 0; i < 1000; i++) {
            System.out.println("主路—————" + i);
        }
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t.interrupt();
    }
}
class User implements Runnable{

    @Override
    public void run() {
        try {
            Thread.sleep(1000*60*60*24*365);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < 1000; i++) {
            System.out.println("支路————" + i);
        }
    }
}
