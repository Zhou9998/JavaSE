package Test;

public class ThreadTest01 {
    public static void main(String[] args) {
        Student s = new Student();
        s.start();
        for (int i = 0; i < 1000; i++) {
            System.out.println("主路—————" + i);
        }
    }
}
class Student extends Thread{

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("支路————" + i);
        }
    }
}