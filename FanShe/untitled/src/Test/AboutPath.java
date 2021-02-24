package Test;

public class AboutPath {
    public static void main(String[] args) throws Exception{
        String s = Thread.currentThread().getContextClassLoader().getResource("Test\\User.class").getPath();
        System.out.println(s);
    }
}
