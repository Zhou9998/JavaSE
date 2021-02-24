package Test;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {
    public static void main(String[] args) {
        FileWriter writer = null;
        try {
            writer = new FileWriter("tempfile1",true);
            char[] chars = {'a','b','c','d','e','f'};
            writer.write(chars);
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (writer != null){
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
