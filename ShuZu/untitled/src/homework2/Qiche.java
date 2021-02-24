package homework2;

public class Qiche extends Weapon  {
    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    private int i = 1;
    @Override
    public String toString() {
        return "汽车";
    }

    @Override
    public void move() {
        System.out.println("汽车移动啦！");
    }
}
