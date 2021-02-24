package Test;

public class ThreadTest04 {
    public static void main(String[] args) {
        Thread t = new Thread(new Student2());
        //Thread.currentThread().setPriority(1);
        //t.setPriority(10);
        t.setName("t1");
        t.start();
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + " " +i);
        }
    }
}

class Student2 implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName()+ " "+i);
        }
    }
}