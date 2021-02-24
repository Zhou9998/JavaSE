package Test;

import java.io.File;
import java.io.FileReader;
import java.util.Properties;

public class IOproperties {
    public static void main(String[] args) throws Exception {
        String s = Thread.currentThread().getContextClassLoader().getResource("temp.properties").getPath();
        FileReader f = new FileReader(s);
        Properties p = new Properties();
        p.load(f);
        String s1 = p.getProperty("Classname");
        System.out.println(s1);
        Class c = Class.forName(s1);
        System.out.println(c.newInstance());
    }
}
