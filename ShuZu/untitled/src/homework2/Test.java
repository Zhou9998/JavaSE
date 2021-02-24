package homework2;

public class Test {
    public static void main(String[] args) {
        Army army = new Army(8);
        try {
            army.addWeapon(new TanKe());
            army.addWeapon(new TanKe());
            army.addWeapon(new FeiJi());
            army.addWeapon(new FeiJi());
            army.addWeapon(new HongZhaJi());
            army.addWeapon(new HongZhaJi());
            army.addWeapon(new Qiche());
            army.addWeapon(new Qiche());
            army.addWeapon(new Qiche());
        } catch (ShuZuYIChang shuZu) {
            System.out.println(shuZu.getMessage());
        }
        army.attackAll();
        army.moveAll();
    }
}
