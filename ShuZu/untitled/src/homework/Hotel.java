package homework;

public class Hotel {
    private Room[][] rooms = new Room[3][6];

    public Hotel() {
    //101对应的下标为[0][0]，204对应的下标为[1][3]；
        for (int i = 0; i < rooms.length; i++) {
            for (int j = 0; j < rooms[i].length; j++) {
                if (i == 0 ){
                    rooms[i][j] = new Room((i+1)*100+j+1 , "大床房", true);
                }else if (i == 1){
                    rooms[i][j] = new Room((i+1)*100+j+1 , "标准间", true);
                }else if (i == 2){
                    rooms[i][j] = new Room((i+1)*100+j+1 , "豪华套房", true);
                }
            }
        }
    }

    public Hotel(Room[][] rooms) {
        this.rooms = rooms;
    }

    public Room[][] getRooms() {
        return rooms;
    }

    public void setRooms(Room[][] rooms) {
        this.rooms = rooms;
    }
    public void print(){
        for (int i = 0; i < rooms.length; i++) {
            for (int j = 0; j < rooms[i].length; j++) {
                System.out.print(rooms[i][j].toString() + " ");
            }
            System.out.println();
        }
    }
    public void DingFang(int roomNo){
        if (rooms[roomNo/100 - 1][roomNo%100-1].getCondition() == false){
            System.out.println("该房间已被占用，无法订房");
            return;
        }
        rooms[roomNo/100 - 1][roomNo%100-1].setCondition(false) ;
        System.out.println(roomNo + "房间预订成功，欢迎入住！");
    }
    public void TuiFang(int roomNo){
        if (rooms[roomNo/100 - 1][roomNo%100-1].getCondition() == true){
            System.out.println("该房间未被使用，无需退房");
            return;
        }
        rooms[roomNo/100 - 1][roomNo%100-1].setCondition(true) ;
        System.out.println(roomNo + "退房成功，欢迎下次再来！");
    }
}
