package Test;

public class ThreadTest03 {
    public static void main(String[] args) {
        Student1 s = new Student1();
        Thread t = new Thread(s);
        System.out.println(Thread.currentThread().getName());
        t.setName("t1");
        t.start();
        try {
            Thread.sleep(1000 * 5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t.interrupt();
    }
}

class Student1 implements Runnable{

    @Override
    public void run() {
        try {
            Thread.sleep(1000*60*60*24*365);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName());
    }
}