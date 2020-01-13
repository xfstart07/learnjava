package patternzen.ch08.v1;

public class NvWa {
    public static void main(String[] args) {
        AbsstractHumanFactory YinYangLu = new HumanFactory();

        System.out.println("--造出的第一批人是白色人种--");
        IHuman white = YinYangLu.createHuman(WhiteHuman.class);
        white.getColor();
        white.talk();

        System.out.println("--造出的第二批人是黄色人种--");
        IHuman yello = YinYangLu.createHuman(YelloHuman.class);
        yello.getColor();
        yello.talk();

        System.out.println("--造出的第三批人是黑色人种--");
        IHuman black = YinYangLu.createHuman(BlackHuman.class);
        black.getColor();
        black.talk();
    }
}
