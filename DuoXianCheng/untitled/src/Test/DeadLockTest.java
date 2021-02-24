package Test;


public class DeadLockTest {
    public static void main(String[] args) {
        Object o1 = new Object();
        Object o2 = new Object();
        Thread t1 = new A1(o1,o2);
        Thread t2 = new A2(o1,o2);
        t1.setName("A1");
        t2.setName("A2");
        t1.start();
        t2.start();
    }
}
class A1 extends Thread{
    Object o1;
    Object o2;

    public A1(Object o1, Object o2) {
        this.o1 = o1;
        this.o2 = o2;
    }

    @Override
    public void run() {
        synchronized (o1){
            try {
                Thread.sleep(1000*5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (o2){
                System.out.println("A1 over");
            }
        }
    }
}
class A2 extends Thread{
    Object o1;
    Object o2;

    public A2(Object o1, Object o2) {
        this.o1 = o1;
        this.o2 = o2;
    }

    @Override
    public void run() {
        synchronized (o2){
            try {
                Thread.sleep(1000*5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (o1){
                System.out.println("A2 over");
            }
        }
    }
}
