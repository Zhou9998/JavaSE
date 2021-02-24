package Test;

import java.util.*;

public class TreeMapTest02 {
    public static void main(String[] args) {
        Map<A1,A2> map = new TreeMap<>(new Comparator<A1>() {
            @Override
            public int compare(A1 o1, A1 o2) {
                return o1.i - o2.i;
            }
        });
        map.put(new A1(2),new A2("huanhuan2"));
        map.put(new A1(1),new A2("huanhuan1"));
        map.put(new A1(3),new A2("huanhuan3"));
        /*Set<A1> s = map.keySet();
        for (A1 s1 : s){
            System.out.println(map.get(s1));
        }*/
/*        Collection<A2> c = map.values();
        for (A2 c1 :c){
            System.out.println(c1);
        }*/
        Set<Map.Entry<A1,A2>> set = map.entrySet();
/*        for (Map.Entry<A1,A2> s :set){
            System.out.println(s.getKey() + " " + s.getValue());
        }*/
        Iterator<Map.Entry<A1,A2>> it = set.iterator();
        while (it.hasNext()){
            Map.Entry<A1,A2> node = it.next();
            System.out.println(node.getKey() + " " + node.getValue());
        }

    }
}
class A1 {
    int i;

    public A1(int i) {
        this.i = i;
    }

    @Override
    public String toString() {
        return String.valueOf(i);
    }

}
/*class A1Comparator implements  Comparator<A1>{

    @Override
    public int compare(A1 o1, A1 o2) {
        return o1.i - o2.i;
    }
}*/
class A2{
    String name;

    public A2(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}