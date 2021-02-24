package Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test02 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("hhah");
        list.add("lalla");
        list.add("dashazhu");
        Iterator<String>  it = list.iterator();
        while (it.hasNext()){
            String s = it.next();
            System.out.println(s);
        }
        System.out.println("----------------");
        list.add(1,"lalala");
        for (String a : list){
            System.out.println(a);
        }
        System.out.println("----------------");
        list.set(1,"dashazhuzhu");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("----------------");
        list.indexOf("lalala");
        list.lastIndexOf("lalala");
        list.remove(2);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println(list.contains("dashazhu"));
    }
}
