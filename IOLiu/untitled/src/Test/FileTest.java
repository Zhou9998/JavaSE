package Test;

import java.io.File;

public class FileTest {
    public static void main(String[] args) {
        File f = new File("C:\\Users\\lenovo\\Desktop\\新建文件夹\\111\\temp.txt");
        if (!f.exists()){
            f.mkdirs();
        }
    }
}
