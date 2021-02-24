package Test;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Random;

public class Test01 {
    public static void main(String[] args)  throws Exception{
        DecimalFormat decimalFormat = new DecimalFormat("###,###.###");
        System.out.println(decimalFormat.format(12154234.5647));
        String time = "20/10/2008";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println(simpleDateFormat.parse(time));
        Random random = new Random();
        int i = random.nextInt(101);
        System.out.println(i);
    }
}
