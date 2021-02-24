package test;

import homework.MyStack;

import java.util.Arrays;
import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {
        while(true) {
            Scanner s = new Scanner(System.in);
            System.out.println("请输入您的行数：");
            int i = s.nextInt();
            for (int j = 1; j <= i; j++) {
                for (int k = 1; k <= i - j; k++) {
                    System.out.print(" ");
                }
                for (int k = j; k >= 2; k--) {
                    System.out.print(k);
                }
                for (int l = 1; l <= j; l++) {
                    System.out.print(l);
                }
                System.out.println();
            }
        }
    }
}
