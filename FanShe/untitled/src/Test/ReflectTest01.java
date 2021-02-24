package Test;

import java.util.Date;

public class ReflectTest01 {
    public static void main(String[] args) throws Exception{
        Class a = Class.forName("java.lang.String");
        Class b = Class.forName("java.util.Date");
        Class c = Class.forName("java.lang.Integer");
        Class d = Class.forName("java.lang.System");
        String s = "abc";
        Class e = s.getClass();
        System.out.println(e==a);
        Date time = new Date();
        Class f = time.getClass();
        System.out.println(b==f);
        Class g = String.class;
        Class h = Integer.class;
        System.out.println(a==g);
        System.out.println(c==h);
    }
}
