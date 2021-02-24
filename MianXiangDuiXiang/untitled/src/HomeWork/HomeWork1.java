package HomeWork;

/*3、在程序中经常要对时间进行操作但是并没有时间类型的数据。
        那么我们可以自己实现一个时间类来满足程序中的需要。
        定义名为MyTime的类其中应有三个整型成员时hour分minute秒second
        为了保证数据的安全性这三个成员变量应声明为私有。
        为MyTime类定义构造方法以方便创建对象时初始化成员变量。
        再定义diaplay方法用于将时间信息打印出来。
        为MyTime类添加以下方法
        addSecond(int sec)
        addMinute(int min)
        addHour(int hou)
        subSecond(int sec)
        subMinute(int min)
        subHour(int hou)
        分别对时、分、秒进行加减运算。*/
public class HomeWork1 {
    public static void main(String[] args) {
        Mytime m1 = new Mytime();
        m1.dispaly();
        Mytime m2 = new Mytime(13,50,12);
        m2.dispaly();
        m2.addSecond(10);
        m2.dispaly();
        m2.addSecond(10);
        m2.dispaly();
        m2.addMinute(10);
        m2.dispaly();
    }
}
class Mytime{
    private int hour;
    private int minute;
    private int second;

    public Mytime() {
    }

    public Mytime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }
    public void dispaly(){
        System.out.println(this.getHour() + "时," + this.getMinute() + "分，" + this.getSecond() + "秒.");
    }
    /* addSecond(int sec)
       addMinute(int min)
       addHour(int hou)
       subSecond(int sec)
       subMinute(int min)
       subHour(int hou)*/
    public void addSecond(int sec){//60
        this.setSecond(this.getSecond() + sec);//12+60=72
        while(this.second >= 60 ){
            this.addMinute(this.getSecond()/60);
            this.setSecond(this.getSecond()%60);
        }

    }

    public void addMinute(int min){
        this.setMinute(this.getMinute() + min);
        while(this.getMinute() >= 60 ) {
            this.addHour(this.getMinute()/60);
            this.setMinute((this.getMinute()) % 60);
        }
    }

    public void addHour(int hou){
        this.setHour(this.getHour() + hou);
        while(this.getHour()>= 24){
            this.setHour(this.getHour()%24);
        }

    }

    public void subSecond(int sec){

    }

    public void  subMinute(int min){

    }

    public void subHour(int hou){

    }
}
