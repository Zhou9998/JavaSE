package Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest01 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("untitled/src/temp");
            System.out.println(fis.available());
            fis.skip(7);
            System.out.println(fis.available());
            byte[] bytes = new byte[fis.available()];
            int i = fis.read(bytes);
            System.out.println(new String(bytes));
            /*int i = 0;
            while ((i = fis.read(bytes)) != -1){
                System.out.print(new String(bytes, 0 ,i));
            }*/
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fis != null){
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
