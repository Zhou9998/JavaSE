package practice1;

public class Test {
    public static void main(String[] args) {
        B b = new B();
        b.E();
        b.Ee();
    }
}
class A{
    private int i;

    public A() {
    }

    public A(int i) {
        this.i = i;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }
    private void E(){
        System.out.println(111);
    }
    public void Ee(){
        this.E();
    }
}
class B extends A{
    public B() {
    }
    public void bb(){
        System.out.println("aaa");
    }
    public void E(){
        System.out.println(222);
    }
}