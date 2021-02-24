package Test;

import java.text.DecimalFormat;

public class Test05 {
    public static void main(String[] args) {

        StringBuffer stringBuffer = new StringBuffer(20);
        stringBuffer.append("a");
        stringBuffer.append(100);
        stringBuffer.append(true);
        System.out.println(stringBuffer);
    }
}
