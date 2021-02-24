package Test;

public class User {
    private int i;

    public User() {
        this(10);
        System.out.println("User的无参数构造方法执行了！");
    }

    public User(int i) {
        System.out.println("User的有参数构造方法执行了！");
        this.i = i;
    }
}
