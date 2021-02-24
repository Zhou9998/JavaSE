package Test;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class MethodTest01 {
    public static void main(String[] args) throws Exception {
        Class c = Class.forName("java.lang.String");
        Method[] m = c.getDeclaredMethods();
        for (Method m1 : m) {
            System.out.print(Modifier.toString(m1.getModifiers()) + "\t");
            System.out.print(m1.getReturnType().getSimpleName() + "\t");
            System.out.print(m1.getName() + "\t");
            Class[] c1 = m1.getParameterTypes();
            for (Class c2 :c1){
                System.out.print(c2.getSimpleName() + "\t");
            }
            System.out.println();
        }
    }
}
