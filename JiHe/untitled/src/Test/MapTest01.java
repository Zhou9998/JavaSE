package Test;

import java.util.*;

public class MapTest01 {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"laoshu");
        map.put(2,"niuniu");
        map.put(3,"laohu");
        map.put(3,"shabi");
        map.put(4,"tutu");
        System.out.println(map.get(1));
        System.out.println(map.size());
        System.out.println(map.containsKey(2));
        System.out.println(map.containsValue("shabi"));
        System.out.println(map.containsValue("laohu"));
        map.put(3,"laohu");
        //Collection<String> values = map.values();
       /* for (String s: values) {
            System.out.println(s);
        }*/
/*        Iterator iterator = values.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }*/
       /* List<String> list = new ArrayList<>(values);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }*/
        //Set<Integer> set = map.keySet();
        /* Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(map.get(iterator.next()));
        }*/
/*      for (Integer s : set){
            System.out.println(map.get(s));
        }*/

       Set<Map.Entry<Integer,String>> set = map.entrySet();
       /*
        Iterator<Map.Entry<Integer,String>> iterator = set.iterator();
        while (iterator.hasNext()){
            Map.Entry<Integer,String> node = iterator.next();
            System.out.println(node.getKey() + " " + node.getValue());
        }*/
        for (Map.Entry<Integer,String> node : set){
            System.out.println(node.getKey() + " " + node.getValue());
        }
    }
}
