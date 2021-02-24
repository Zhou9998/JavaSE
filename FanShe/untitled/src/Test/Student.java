package Test;

public class Student {
    private String name;
    protected int age;
    boolean sex;
    public int no;
    public static final double MATH_PI = 3.1415926;

    @Override
    public String
    toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                ", no=" + no +
                '}';
    }
}

