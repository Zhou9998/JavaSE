package practice1;

public class Test1 {
    public static void main(String[] args) {
        Chinese c = new Chinese();
        System.out.println(Chinese.COUNTRY);
    }

}
class Chinese{
    private String idCard;
    private String name;
    private String birth;
    public static final String COUNTRY = "中国";

    public Chinese() {
    }

    public Chinese(String idCard, String name, String birth) {
        this.idCard = idCard;
        this.name = name;
        this.birth = birth;
    }

    public  String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }
}
