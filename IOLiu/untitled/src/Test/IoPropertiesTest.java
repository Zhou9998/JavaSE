package Test;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.Properties;


public class IoPropertiesTest {
    public static void main(String[] args) throws Exception {
        FileReader fr  = new FileReader("untitled\\tempfile4.properties");
        Properties p = new Properties();
        p.load(fr);
        fr.close();
        System.out.println(p.getProperty("huanhuan"));
        System.out.println(p.getProperty("huimin"));
    }
}
