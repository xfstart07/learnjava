package patternzen.ch19.example1;

public class OutUserClient {
    public static void main(String[] args) {
        IUserInfo youngGirl = new OuterUserInfo();
        for (int i=0;i<100;i++) {
            youngGirl.getMobileNumber();
        }
    }
}
