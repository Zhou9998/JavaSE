package Test;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test06 {
    public static void main(String[] args) throws Exception {
        long nowTimes = System.currentTimeMillis();
        System.out.println(nowTimes);
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("SSS.ss.mm.HH dd/MM/yyyy");
        System.out.println(sdf.format(date));//字符串
        String s = "1998-11-23";
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
        Date dateTime = sdf2.parse(s);
        System.out.println(dateTime);
        Date date1 = new Date(System.currentTimeMillis() - 60*1000*60*24);
        System.out.println(sdf.format(date1));
        BigDecimal bigDecimal = new BigDecimal(100);
        BigDecimal bigDecimal1 = new BigDecimal(20);
        BigDecimal bigDecimal2 = bigDecimal.add(bigDecimal1);
        System.out.println(bigDecimal2);
        DecimalFormat df = new DecimalFormat("###,###.0000");
        String s1 = df.format(123487.11);
        System.out.println(s1);
        String a = "1999/11/23";
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy/MM/dd");
        Date date2 = sdf1.parse(a);
        System.out.println(date2);
        Date a1 = new Date(System.currentTimeMillis() - 86400 * 365L *1000);
        System.out.println(sdf1.format(a1));
    }
}
