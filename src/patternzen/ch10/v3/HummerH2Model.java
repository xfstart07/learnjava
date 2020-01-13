package patternzen.ch10.v3;

public class HummerH2Model extends HummerModel {

    public void start() {
        System.out.println("悍马 H2 发动...");
    }

    public void stop() {
        System.out.println("悍马 H2 停车...");
    }

    public void alarm() {
        System.out.println("悍马 H2 鸣笛...");
    }

    public void engineBoom() {
        System.out.println("悍马 H2 引擎声音是这样的...");
    }

    protected boolean isAlarm() {
        return false;
    }
}
