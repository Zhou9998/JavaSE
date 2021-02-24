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

import java.util.Objects;

public class Room {
    private int roomNo;
    private String type;
    private boolean status;

    public Room() {
    }

    public Room(int roomNo, String type, boolean status) {
        this.roomNo = roomNo;
        this.type = type;
        this.status = status;
    }

    public int getRoomNo() {
        return roomNo;
    }

    public void setRoomNo(int roomNo) {
        this.roomNo = roomNo;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "[" + roomNo + "," + type + "," + (status? "空闲":"占用") + "]" + " ";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || (o instanceof Room)) return false;
        Room room = (Room) o;
        return this.roomNo == room.roomNo;
    }

}
