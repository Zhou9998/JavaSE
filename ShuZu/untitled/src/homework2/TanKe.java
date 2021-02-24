package homework2;

public class TanKe extends Weapon  {
    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    private int i = 0;
    @Override
    public String toString() {
        return "坦克";
    }

    @Override
    public void shoot() {
        System.out.println("坦克射击啦！");
    }
}
