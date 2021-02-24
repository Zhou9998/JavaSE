package homework3;

import java.util.Random;
import java.util.Scanner;

public class HotelTest {
    public static void main(String[] args) {
        Hotel hotel = new Hotel();
        System.out.println("欢迎使用酒店管理系统！");
        Scanner s = new Scanner(System.in);
        while(true){
            System.out.println("请选择您要使用的功能：[1]表示查看房间列表。[2]表示订房。[3]表示退房。[0]表示退出系统。");
            int i = s.nextInt();
            if (i == 1){
                hotel.print();
            }else if (i == 2){
                System.out.println("请输入您要订的房间号:");
                try {
                    hotel.DingFang(s.nextInt());
                } catch (RoomException e) {
                    System.out.println(e.getMessage());
                }
            }else if (i == 3){
                System.out.println("请输入您要退的房间号：");
                try {
                    hotel.TuiFang(s.nextInt());
                } catch (RoomException e) {
                    System.out.println(e.getMessage());}
            }else if (i == 0){
                System.out.println("欢迎下次使用！");
                return;
            }else {
                System.out.println("您选择的功能不正确！");
            }
        }
    }
}
