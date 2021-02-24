package Test;

public class ReflectTest02 {
    public static void main(String[] args) throws Exception{
        Class a = Class.forName("Test.User");
        Object o = a.newInstance();
        System.out.println(o);
    }
}
