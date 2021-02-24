package Test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class PrintStreamTest {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello World!");
        PrintStream ps = System.out;
        ps.println("haha");
        PrintStream ps1 = new PrintStream(new FileOutputStream("log",true));
        System.setOut(ps1);
        System.out.println("祝慧敏大笨笨!");
    }
}
