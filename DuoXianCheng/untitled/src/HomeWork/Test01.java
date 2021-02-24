package HomeWork;

public class Test01 {
    public static void main(String[] args) {
        Num n = new Num(1);
        Thread t1 = new T1(n);
        Thread t2 = new T2(n);
        t1.setName("t1");
        t2.setName("t2");
        t1.start();
        t2.start();
    }
}
class Num{
    int i;

    public Num(int i) {
        this.i = i;
    }

}

class T1 extends Thread{
    private Num n;

    public T1(Num n) {
        this.n = n;
    }
    public void run() {
        while (n.i < 100){
            synchronized (n){
                if ((n.i) % 2 == 0){
                    try {
                        n.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(Thread.currentThread().getName()+ "----->" + n.i);
                n.i++;
                n.notifyAll();
            }
        }
    }
}
class T2 extends Thread{
    private Num n;

    public T2(Num n) {
        this.n = n;
    }

    @Override
    public void run() {
        while (n.i <100){
            synchronized (n){
                if ((n.i) % 2 == 1){
                    try {
                        n.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(Thread.currentThread().getName()+ "----->" + n.i);
                n.i++;
                n.notifyAll();
            }
        }
    }
}
