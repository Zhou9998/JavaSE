package HomeWork;

public class UserService {
    public UserService() {
    }

    public void register(String username, String password) throws YiChang {

        if (username == null || username.length() < 4||username.length()>16){
            throw new YiChang("用户名输入不合法！");
        }
        System.out.println("登录成功！ 欢迎:" + username);
    }
}