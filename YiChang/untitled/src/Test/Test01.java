package Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Test01 {
    public static void main(String[] args) {
        String s = "1998-11-23";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        try {
            System.out.println(simpleDateFormat.parse(s));
        } catch (Exception e) {
            System.out.println("出问题啦");
        }
        System.out.println("dashazhu");
    }
}
