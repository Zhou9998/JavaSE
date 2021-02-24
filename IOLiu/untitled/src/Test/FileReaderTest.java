package Test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {
    public static void main(String[] args) {
        FileReader reader = null;
        try {
            reader = new FileReader("untitled\\src\\temp");
            char[] chars = new char[4];
            int i = 0;
            while ((i = reader.read(chars)) != -1){
                System.out.print(new String(chars, 0,i));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (reader != null){
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
