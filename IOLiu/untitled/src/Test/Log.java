package Test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Log {
    public static void logger( String msg) {
        PrintStream ps = null;
        try {
            ps = new PrintStream(new FileOutputStream("log",true));
            System.setOut(ps);
            Date date = new Date();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS");
            System.out.println(sdf.format(date) + "  " +msg);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
