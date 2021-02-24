package Test;

public class Test04 {
    public static void main(String[] args) {
        System.out.println("中国人".charAt(2));//人
        System.out.println("abc".compareTo("bca"));//a = 97; b = 98; a-b = -1;
        System.out.println("dashabi".contains("shabi"));//true
        System.out.println("dashabi".endsWith("shabi"));//true
        System.out.println("dashabi".startsWith("shabi"));//false
        String a  = "abc";
        System.out.println("abc".equals(a));//true
        a = "Abc";
        System.out.println(a.equalsIgnoreCase("abc"));//true
        byte[] bytes = "abcde11".getBytes();//自动转换为Asc||码的形式;
        for (int i = 0; i < bytes.length; i++) {
            System.out.print(bytes[i]+" ");
        }
        System.out.println();
        System.out.println("abcaaabbb".indexOf("b"));//1
        System.out.println("abcaaabbb".lastIndexOf("b"));//8
        System.out.println("".isEmpty());//true
        System.out.println("a".isEmpty());//false
        System.out.println("abvasdasd".length());//9
        System.out.println("zhuhuimindashazhu".replaceAll("dashazhu","dashagou"));
        //返回类型String，如果原字符串不含应替换的字符串，则返回原字符串；
        String[] b = "1998-11-23".split("-");
        for (int i = 0; i < b.length; i++) {
            System.out.print( b[i] + " ");
        }
        System.out.println();
        System.out.println("aaawwwww.baidu.commmmm".substring(5,18));
        char[] chars = "abcd".toCharArray();
        for (int i = 0; i < chars.length; i++) {
            System.out.print(chars[i] + " ");
        }
        System.out.println();
        String s = "ABCdef";
        System.out.println(s.toLowerCase());
        System.out.println(s.toUpperCase());
        System.out.println("                    a a a           ".trim());
    }
}
