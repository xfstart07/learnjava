package patternzen.ch19.v1;

public class UserClient {
    public static void main(String[] args) {
        IUserInfo youngGirl = new UserInfo();
        for (int i=0;i<100;i++) {
            youngGirl.getMobileNumber();
        }
    }
}
