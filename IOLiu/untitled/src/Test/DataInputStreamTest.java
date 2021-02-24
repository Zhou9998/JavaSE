package Test;

import java.io.DataInputStream;
import java.io.FileInputStream;

public class DataInputStreamTest {
    public static void main(String[] args) throws Exception{
        DataInputStream dis = new DataInputStream(new FileInputStream("tempfile3"));
        System.out.println(dis.readByte());
        System.out.println(dis.readShort());
        System.out.println(dis.readInt());
        System.out.println(dis.readLong());
        System.out.println(dis.readFloat());
        System.out.println(dis.readDouble());
        System.out.println(dis.readBoolean());
        System.out.println(dis.readChar());

    }
}
