package Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyTest01 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            fis = new FileInputStream("C:\\Users\\lenovo\\Desktop\\07-JavaSE进阶每日复习与笔记\\day31课堂笔记.txt");
            fos = new FileOutputStream("Test");
            byte[] bytes = new byte[1024];
            int i = 0;
            while ((i = fis.read(bytes)) != -1){
                fos.write(bytes,0,i);
            }
            fos.flush();
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
            if (fos != null){
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
