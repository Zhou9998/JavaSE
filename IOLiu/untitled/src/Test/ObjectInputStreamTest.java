package Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;
import java.util.List;


public class ObjectInputStreamTest {
    public static void main(String[] args) throws Exception {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Students"));
        List<Student> list = (List<Student>)ois.readObject();
        for (Student list1: list
             ) {
            System.out.println(list1);
        }
    }
}
