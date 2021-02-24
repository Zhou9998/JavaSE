package Test;

import java.lang.constant.Constable;
import java.util.Comparator;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.BiPredicate;

public class TreeMapTest01 {
    public static void main(String[] args) {
        Set<String> set = new TreeSet();
        set.add("a");
        set.add("e");
        set.add("c");
        set.add("b");
        set.add("c");
        set.add("d");
        System.out.println(set.size());
        for (String s : set){
            System.out.println(s);
        }
        Set<Vip> set1 = new TreeSet<>(new Comparator<Vip>() {
            @Override
            public int compare(Vip o1, Vip o2) {
                return o1.getNo() - o2.getNo();
            }
        });
        set1.add(new Vip(100));
        set1.add(new Vip(200));
        for (Vip s : set1){
            System.out.println(s);
        }
    }
}
class Vip  {
    int No;

    public Vip(int no) {
        No = no;
    }

    public int getNo() {
        return No;
    }

    public void setNo(int no) {
        No = no;
    }


    @Override
    public String toString() {
        return "Vip{" +
                "No=" + No +
                '}';
    }
}
/*
class VipComparator implements Comparator<Vip>{

    @Override
    public int compare(Vip o1, Vip o2) {
        return o1.getNo() - o2.getNo();
    }
}*/
