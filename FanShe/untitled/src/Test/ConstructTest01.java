package Test;

import java.lang.reflect.Field;

public class ConstructTest01  {
    public static void main(String[] args) throws Exception{
        Class c = Class.forName("Test.User");
        Object o = c.newInstance();
        Field  f = c.getDeclaredField("i");
        f.setAccessible(true);
        System.out.println(f.get(o));
    }
}
