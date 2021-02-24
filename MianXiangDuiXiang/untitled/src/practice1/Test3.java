package practice1;

import java.io.IOError;
import java.util.concurrent.CompletionException;

public class Test3 {
    public static void main(String[] args) {
        Computer c = new Computer(new JianPan());
        c.chaRu();
    }
}
class Computer{
    private InsertDrawable i;

    public Computer(InsertDrawable i) {
        this.i = i;
    }

    public Computer() {
    }

    public InsertDrawable getI() {
        return i;
    }

    public void setI(InsertDrawable i) {
        this.i = i;
    }
    public void chaRu(){
        i.shuChu();
    }
}
interface InsertDrawable{
    void shuChu();
}
class ShuBiao implements InsertDrawable{
    public void shuChu(){
        System.out.println("鼠标输出了！");
    }
}
class JianPan implements InsertDrawable{
    @Override
    public void shuChu() {
        System.out.println("键盘输出啦！");
    }
}
class XianShiQi implements InsertDrawable{
    @Override
    public void shuChu() {
        System.out.println("显示器输出啦！");
    }
}
class DaYinJi implements InsertDrawable{
    @Override
    public void shuChu() {
        System.out.println("打印机输出啦！");
    }
}

