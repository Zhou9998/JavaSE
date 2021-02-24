package test;

import java.util.Scanner;

public class Test02 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("请输入行数：");
        int i = s.nextInt();
        for (int j = 1; j <= i; j++) {
            for (int k = 1; k <= i - j; k++) {
                System.out.print(" ");
            }
            for (int l = 1; l <= 2*j-1;l++ ){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int j = 1; j <= i-1 ; j++) {
            for (int k = 1;  k <= j; k++) {
                System.out.print(" ");
            }
            for (int l = 1; l <= 2*(i-j)-1 ; l++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
