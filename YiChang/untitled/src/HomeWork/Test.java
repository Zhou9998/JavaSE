package HomeWork;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner s  = new Scanner(System.in);
        System.out.println("请输入用户名：");
        int i = s.nextInt();
        System.out.println("请输入密码：");
        int j = s.nextInt();
        UserService userService = new UserService();
        try {
            userService.register(String.valueOf(i),String.valueOf(j));
        } catch (YiChang yiChang) {
            String s1 = yiChang.getMessage();
            System.out.println(s1);
        }
    }
}
