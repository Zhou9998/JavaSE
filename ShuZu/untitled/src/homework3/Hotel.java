package homework3;
/*
：（java软件工程师人生路上第一个小型项目。锻炼一下面向对象。）
        为某个酒店编写程序：酒店管理系统，模拟订房、退房、打印所有房间状态等功能。
        1、该系统的用户是：酒店前台。
        2、酒店使用一个二维数组来模拟。“Room[][] rooms;”
        3、酒店中的每一个房间应该是一个java对象：Room
        4、每一个房间Room应该有：房间编号、房间类型、房间是否空闲.
        5、系统应该对外提供的功能：
        可以预定房间：用户输入房间编号，订房。
        可以退房：用户输入房间编号，退房。
        可以查看所有房间的状态：用户输入某个指令应该可以查看所有房间状态。

*/

public class Hotel {
    private Room[][] rooms = new Room[3][6];

    public Room[][] getRooms() {
        return rooms;
    }

    public void setRooms(Room[][] rooms) {
        this.rooms = rooms;
    }

    public Hotel() {
        for (int i = 0; i <rooms.length ; i++) {
            for (int j = 0; j < rooms[i].length; j++) {
                if (i==0){
                    rooms[i][j] = new Room((i+1)*100+j+1,"标准间",true);
                }else if (i==1){
                    rooms[i][j] = new Room((i+1)*100+j+1,"大床房",true);
                }else if (i==2){
                    rooms[i][j] = new Room((i+1)*100+j+1,"豪华间",true);
                }
            }
        }
    }
    public void print(){
        for (int i = 0; i < rooms.length; i++) {
            for (int j = 0; j < rooms[i].length ; j++) {
                System.out.print(rooms[i][j]);
            }
            System.out.println();
        }
    }
    public void DingFang(int No) throws RoomException {
        if (rooms[(No-1)/100 - 1 ][No%100-1].getStatus() == false){
            throw new RoomException("该房间已被占用，无法订房！");
        }
        rooms[(No-1)/100 - 1 ][No%100-1].setStatus(false);
        System.out.println(No + "号房间订房成功！");
    }
    public void TuiFang(int No) throws RoomException {
        if (rooms[(No-1)/100 - 1 ][No%100-1].getStatus() == true){
            throw new RoomException("该房间未被占用，无法退房！");
        }
        rooms[(No-1)/100 - 1 ][No%100-1].setStatus(true);
        System.out.println(No + "号房间退房成功！");
    }

}
