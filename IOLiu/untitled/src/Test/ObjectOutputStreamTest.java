package Test;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class ObjectOutputStreamTest {
    public static void main(String[] args) throws Exception {
        List<Student> list = new ArrayList<>();
        list.add(new Student(1,"zhuhuimin"));

        list.add(new Student(2,"zhuhuanhuan"));

        list.add(new Student(3,"zhuxiaopang"));

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Students"));
        oos.writeObject(list);
        oos.flush();
        oos.close();
    }
}

