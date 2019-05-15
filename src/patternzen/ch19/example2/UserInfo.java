package patternzen.ch19.example2;

public class UserInfo implements IUserInfo {
    @Override
    public String getUserName() {
        System.out.println("姓名叫做...");
        return null;
    }

    @Override
    public String getHomeAddress() {
        System.out.println("地址叫做...");
        return null;
    }

    @Override
    public String getMobileNumber() {
        System.out.println("手机叫做...");
        return null;
    }

    @Override
    public String getOfficeTelNumber() {
        System.out.println("办公室电话叫做...");
        return null;
    }

    @Override
    public String getJobPosition() {
        System.out.println("这个职位叫做...");
        return null;
    }

    @Override
    public String getHomeTelNumber() {
        System.out.println("家里电话叫做...");
        return null;
    }
}
