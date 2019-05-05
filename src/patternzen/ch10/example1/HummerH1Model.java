package patternzen.ch10.example1;

public class HummerH1Model extends HummerModel {

    public void start() {
        System.out.println("悍马 H1 发动...");
    }

    public void stop() {
        System.out.println("悍马 H1 停车...");
    }

    public void alarm() {
        System.out.println("悍马 H1 鸣笛...");
    }

    public void engineBoom() {
        System.out.println("悍马 H1 引擎声音是这样的...");
    }

    public void run() {
        //先发动汽车
        this.start();
        //引擎开始轰鸣
        this.engineBoom();
        //然后就开始跑了，跑的过程中遇到一条狗挡路，就按喇叭
        this.alarm();
        //到达目的地就停车
        this.stop();
    }
}
