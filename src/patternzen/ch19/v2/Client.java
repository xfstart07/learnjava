package patternzen.ch19.v2;

public class Client {
    public static void main(String[] args) {
        IOuterUserBaseInfo baseInfo = new OuterUserBaseInfo();
        IOuterUserHomeInfo homeInfo = new OuterUserHomeInfo();
        IOuterUserOfficeInfo officeInfo = new OuterUserOfficeInfo();

        IUserInfo youngGirl = new OuterUserInfo(baseInfo, homeInfo, officeInfo);

        for (int i=0;i<100;i++) {
            youngGirl.getMobileNumber();
        }
    }
}
