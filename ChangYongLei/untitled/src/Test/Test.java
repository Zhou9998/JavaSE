package Test;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while (true) {
            System.out.print("请输入第一个数字:");
            int num1 = s.nextInt();
            System.out.print("请输入第二个数字:");
            int num2 = s.nextInt();
            System.out.print("请输入第三个数字:");
            int num3 = s.nextInt();
            if (num1 > num2) {
                int a = num2;
                num2 = num1;
                num1 = a;
                if (num2 > num3) {
                    int b = num3;
                    num3 = num2;
                    num2 = b;
                }
                if (num1 > num2) {
                    int c = num2;
                    num2 = num1;
                    num1 = c;
                }
            } else if (num2 > num3) {
                int b = num3;
                num3 = num2;
                num2 = b;
                if (num1 > num2) {
                    int c = num2;
                    num2 = num1;
                    num1 = c;
                }
            }
            System.out.println(num1 + "<" + num2 + "<" + num3);
        }
    }

}
