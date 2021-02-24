package Test;

import java.lang.reflect.Field;

public class ReflectTest05 {
    public static void main(String[] args) throws Exception{
        Class c = Class.forName("Test.Student");
        Object o = c.newInstance();
        Field f = c.getDeclaredField("no");
        f.set(o,1111);
        System.out.println(f.get(o));
        Field f1 = c.getDeclaredField("name");
        f1.setAccessible(true);
        f1.set(o,"huanhuan");
        System.out.println(f1.get(o));
    }
}

