package practice1;

public class Test2{
    public static void main(String[] args) {
        C c = new C();
        c.setI(5);
        System.out.println(c.getI());
        D d = new D(1,2);
        System.out.println(c.getI());
        System.out.println(d.getI());
        d.Dd();
        d.setI(7);
        System.out.println(c.getI());
        System.out.println(d.getI());

    }
}
class C{
    private int i;

    public C() {
    }

    public C(int i) {
        this.i = i;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }
}
class D extends C{
    int j;
    public D() {
    }

    public D(int i, int j) {
        super(i);
        this.j = j;
    }
    public void Dd(){
        System.out.println(super.getI());
    }

}