package Test;

public class ReflectTest06 {
    public static void main(String[] args) throws  Exception{
        Class c = Class.forName("java.lang.String");
        Class c1 = c.getSuperclass();
        System.out.println(c1.getSimpleName());
        Class[] c2 = c.getInterfaces();
        for (Class c3 : c2){
            System.out.println(c3.getSimpleName());
        }
    }
}
