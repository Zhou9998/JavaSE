package Test;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

public class BufferedWriterTest {
    public static void main(String[] args) throws Exception{
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("tempfile2",true)));
        writer.write("祝慧敏");
        writer.write("实在是有点傻傻的");
        writer.write("就是个笨笨!");
        writer.close();
    }
}
