package Test;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class ReflectTest04 {
    public static void main(String[] args) throws Exception {
        Class c = Class.forName("Test.Student");
        Field[] field = c.getDeclaredFields();
        for (Field f :field){
            System.out.print(Modifier.toString(f.getModifiers()));
            System.out.print("\t");
            System.out.print(f.getType().getSimpleName());
            System.out.print("\t");
            System.out.print(f.getName());
            System.out.print("\n");
        }
    }
}
