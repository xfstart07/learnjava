package patternzen.ch08.v1;

public class WhiteHuman implements IHuman {
    @Override
    public void getColor() {
        System.out.println("白色人种的皮肤颜色是白色的！");
    }

    @Override
    public void talk() {
        System.out.println("白人会说话，一般说的都是单字节。");
    }
}
