package Test;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class DataOutoutStream {
    public static void main(String[] args) throws Exception {
        DataOutputStream outoutStream = new DataOutputStream(new FileOutputStream("tempfile3"));
        byte b = 1;
        short s = 2;
        int i = 3;
        long l = 4L;
        float f = 5.0f;
        double d = 6.0;
        boolean bb = false;
        char c = 'a';
        outoutStream.writeByte(b);
        outoutStream.writeShort(s);
        outoutStream.writeInt(i);
        outoutStream.writeLong(l);
        outoutStream.writeFloat(f);
        outoutStream.writeDouble(d);
        outoutStream.writeBoolean(bb);
        outoutStream.writeChar(c);
        outoutStream.close();
    }
}
