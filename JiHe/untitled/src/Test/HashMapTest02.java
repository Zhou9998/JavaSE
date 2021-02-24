package Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapTest02 {
    public static void main(String[] args) {
        Map<Student,No> map  = new HashMap<>();
        Student s1 = new Student("zhangsan");
        Student s2 = new Student("zhangsan");
        Student s3 = new Student("lisi");
        No no1 = new No(101);
        No no2 = new No(102);
        map.put(s1,no1);
        map.put(s2,no1);
        map.put(s1,no2);
        map.put(s3,no1);
        map.put(s3,no2);
        System.out.println(map.size());
        Set<Map.Entry<Student,No>> set = map.entrySet();
        for (Map.Entry<Student,No> s :set){
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
class  No{
    private int no;

    public No() {
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public No(int no) {
        this.no = no;
    }

    @Override
    public String toString() {
        return String.valueOf(no);
    }
}
