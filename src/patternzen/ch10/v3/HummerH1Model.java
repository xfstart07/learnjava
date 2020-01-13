package patternzen.ch10.v3;

public class HummerH1Model extends HummerModel {
    private boolean alarmFlag = true; // 要响喇叭

    protected void start() {
        System.out.println("悍马 H1 发动...");
    }

    protected void stop() {
        System.out.println("悍马 H1 停车...");
    }

    protected void alarm() {
        System.out.println("悍马 H1 鸣笛...");
    }

    protected void engineBoom() {
        System.out.println("悍马 H1 引擎声音是这样的...");
    }

    protected boolean isAlarm() {
        return this.alarmFlag;
    }

    public void setAlarm(boolean isAlarm) {
        this.alarmFlag = isAlarm;
    }
}
