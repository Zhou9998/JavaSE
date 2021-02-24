package homework2;

public class HongZhaJi extends Weapon  {

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    private int i = 0;
    @Override
    public String toString() {
        return "轰炸机";
    }

    @Override
    public void shoot() {
        System.out.println("轰炸机射击啦！");
    }
}
