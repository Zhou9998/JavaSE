package Test;

import java.lang.reflect.Method;

public class MethodTest02 {
    public static void main(String[] args) throws Exception {
        Class c = Class.forName("Test.Student");
        Object o = c.newInstance();
        Method m = c.getDeclaredMethod("toString");
        System.out.println(m.invoke(o));
    }
}
