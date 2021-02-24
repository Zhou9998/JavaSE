package Test;

import java.io.*;
import java.nio.file.FileVisitResult;
import java.util.Properties;

public class ReflectTest03 {
    public static void main(String[] args) throws Exception {
        FileOutputStream f = null;
        try {
             f = new FileOutputStream("temp.properties");
             String s = "Classname = java.util.Date";
             byte[] b = s.getBytes();
             f.write(b);
             f.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (f != null){
                try {
                    f.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        FileReader f1 = new FileReader("temp.properties");
        Properties p = new Properties();
        p.load(f1);
        String s = p.getProperty("Classname");
        System.out.println(s);
        Class c = Class.forName(s);
        Object o = c.newInstance();
        System.out.println(o);
    }
}
