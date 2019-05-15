package patternzen.ch19.example2;

import java.util.Map;

public class OuterUserInfo implements IUserInfo {
    private IOuterUserBaseInfo baseInfo = null;
    private IOuterUserHomeInfo homeInfo = null;
    private IOuterUserOfficeInfo officeInfo = null;

    private Map baseMap = null;
    private Map homeMap = null;
    private Map officeMap = null;

    public OuterUserInfo(IOuterUserBaseInfo _baseInfo, IOuterUserHomeInfo _homeInfo, IOuterUserOfficeInfo _officeInfo) {
        this.baseInfo = _baseInfo;
        this.homeInfo = _homeInfo;
        this.officeInfo = _officeInfo;

        this.baseMap = this.baseInfo.getUserBaseInfo();
        this.homeMap = this.homeInfo.getUserHomeInfo();
        this.officeMap = this.officeInfo.getUserOfficeInfo();
    }

    @Override
    public String getUserName() {
        String userName = (String)this.baseMap.get("userName");
        System.out.println(userName);
        return userName;
    }

    @Override
    public String getHomeAddress() {
        String homeAddr = (String)this.homeMap.get("homeAddress");
        System.out.println(homeAddr);
        return homeAddr;
    }

    @Override
    public String getMobileNumber() {
        String mobileNumber = (String)this.baseMap.get("mobileNumber");
        System.out.println(mobileNumber);
        return mobileNumber;
    }

    @Override
    public String getOfficeTelNumber() {
        String officeTelNumbe = (String)this.officeMap.get("officeTelNumber");
        System.out.println(officeTelNumbe);
        return officeTelNumbe;
    }

    @Override
    public String getJobPosition() {
        String jobPosition = (String)this.officeMap.get("jobPosition");
        System.out.println(jobPosition);
        return jobPosition;
    }

    @Override
    public String getHomeTelNumber() {
        String homeTelNumber = (String)this.homeMap.get("homeTelNumber");
        System.out.println(homeTelNumber);
        return homeTelNumber;
    }
}
