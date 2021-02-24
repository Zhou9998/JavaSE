package homework2;
/*
该类还提供一个方法addWeapon(Weapon wa),表示把参数wa所代表的武器加入到数组w中。
        在这个类中还定义两个方法attackAll()让w数组中的所有武器攻击；
        以及moveAll()让w数组中的所有可移动的武器移动。
*/

public class Army {
    private Weapon[] w;
    private int count;

    public Army(int i ) {
        w = new Weapon[i];
        count = 0;
    }

    public void addWeapon(Weapon wa) throws ShuZuYIChang {
        if (count >= w.length){
            throw new ShuZuYIChang("武器数量已经达到上限！");
        }
        w[count++] = wa;
        System.out.println(wa + "已经添加到武器库中！");
    }
    public void attackAll(){
        for (int i = 0; i <w.length ; i++) {
            if (w[i].getI() ==0){
                w[i].shoot();
            }
        }
    }
    public void moveAll(){
        for (int i = 0; i <w.length ; i++) {
            if (w[i].getI() ==1){
                w[i].move();
            }
        }
    }
}