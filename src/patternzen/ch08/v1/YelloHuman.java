package patternzen.ch08.v1;

public class YelloHuman implements IHuman {
    @Override
    public void getColor() {
        System.out.println("黄色人种的皮肤颜色是黄色的！");
    }

    @Override
    public void talk() {
        System.out.println("黄人会说话，一般说的都是双字节。");
    }
}
