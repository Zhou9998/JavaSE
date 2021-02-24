package Test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Test02 {
    public static void main(String[] args) {
        Date nowTime = new Date();
        System.out.println(nowTime);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println(sdf.format(new Date()));
        long a = System.currentTimeMillis();
        System.out.println(a);
        Date nowTime1 = new Date(System.currentTimeMillis() - 1000*60*60*24*365L);
        SimpleDateFormat sdf2 = new SimpleDateFormat();
        System.out.println(sdf2.format(nowTime1));

    }
}
