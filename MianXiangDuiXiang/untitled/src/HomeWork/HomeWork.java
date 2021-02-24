package HomeWork;

/*定义名为Number的类其中有两个整型数据成员n1和n2应声明为私有。
        编写构造方法赋予n1和n2初始值
        再为该类定义加addition()、减subtration()、乘multiplication()、除division()等公有实例方法
        分别对两个成员变量执行加、减、乘、除的运算。

        在main方法中创建Number类的对象调用各个方法并显示计算结果*/
public class HomeWork {
    public static void main(String[] args) {
        Number i = new Number(10,3.0);
        System.out.println(i.addition());
        System.out.println(i.subtration());
        System.out.println(i.multiplication());
        System.out.println(i.division());
    }
}
class Number{
    private int n1;
    private double n2;
    public Number() {

    }

    public Number(int n1, double n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    public int getN1() {
        return n1;
    }

    public void setN1(int n1) {
        this.n1 = n1;
    }

    public double getN2() {
        return n2;
    }

    public void setN2(double n2) {
        this.n2 = n2;
    }

    public double addition(){
        return this.n1 + this.n2;
    }

    public double  subtration(){
        return this.n1 - this.n2;
    }

    public double  multiplication(){
        return this.n1 * this.n2;
    }

    public double division(){
        return this.n1 / this.n2;
    }
}
