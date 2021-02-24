package homework2;

public class FeiJi extends Weapon  {
    private int i = 1;
    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }


    @Override
    public String toString() {
        return "飞机";
    }

    @Override
    public void move() {
        System.out.println("飞机起飞了！");
    }
}
