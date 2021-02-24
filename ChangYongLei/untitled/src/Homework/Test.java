package Homework;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
    /*  Scanner s = new Scanner(System.in);
        System.out.print("请输入a：");
        double a = s.nextDouble();
        System.out.print("请输入b：");
        double b = s.nextDouble();*/
        double a = 1.0;
        double b = 2.0;
        while ((b-a)/2 >= 0.0005){
            System.out.print("f(x) = f(" + (a+b)/2 +")" +(F((b+a)/2)>0? ">":"<")+ 0);
            double i = F((b+a)/2);
            if (i<0){
                a = (b+a)/2;
            }else if (i>0){
                b = (b+a)/2;
            }
            System.out.print(" ");
            System.out.print("a = " +a);
            System.out.print(" ");
            System.out.print("b = " +b);
            System.out.print(" ");
            System.out.print("x = "+(a+b)/2 );
            System.out.print(" ");
            System.out.println("误差 = "+ (b-a)/2);
        }
    }
    public static double F(double x){
        double i = Math.pow(Math.E,x)-x-2;
        return i;
    }
}
