package Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Test01 {
    public static void main(String[] args) {
        Collection collection = new ArrayList();
        collection.add(100);
        collection.add("aaa");
        collection.add("dashazhu");
        collection.add(true);
        System.out.println(collection.size());
        String s = "dashazhu";
        collection.remove(s);
        System.out.println(collection.size());
        System.out.println(collection.isEmpty());
        collection.clear();
        System.out.println(collection.size());
        System.out.println(collection.isEmpty());
        collection.add(100);
        collection.add("aaa");
        collection.add("dashazhu");
        collection.add(true);
        Object[] objects = collection.toArray();
        for (int i = 0; i < objects.length ; i++) {
            System.out.print(objects[i] + " ");
        }
        Iterator it = collection.iterator();
        while (it.hasNext()){
            Object object = it.next();
            System.out.print(object + " ");
        }
    }
}
