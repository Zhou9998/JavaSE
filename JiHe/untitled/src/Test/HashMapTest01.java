package Test;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class HashMapTest01 {
    public static void main(String[] args) {
        Set<Student> s  = new HashSet<>();
        Student t1 = new Student("zhangsan");
        Student t2 = new Student("zhangsan");
        s.add(t1);
        s.add(t2);
        System.out.println(s.size());
        System.out.println(t1.hashCode());//284720968
        System.out.println(t2.hashCode());//189568618
    }
}

class Student {
    private  String name ;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student test1 = (Student) o;
        return Objects.equals(name, test1.name);
    }

     @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return name;
    }
}