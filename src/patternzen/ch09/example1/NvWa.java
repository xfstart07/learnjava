package patternzen.ch09.example1;

public class NvWa {
    public static void main(String[] args) {
        HumanFactory maleFactory = new MaleFactory();
        HumanFactory femaleFactory = new FemaleFactory();


        System.out.println("--造出的第一批人是白色人种--");
        IHuman white = maleFactory.createWhiteHuman();
        white.getColor();
        white.talk();
        white.getSex();

        System.out.println("--造出的第二批人是黄色人种--");
        IHuman yello = femaleFactory.createYellowHuman();
        yello.getColor();
        yello.talk();
        yello.getSex();

        System.out.println("--造出的第三批人是黑色人种--");
        IHuman black = maleFactory.createBlackHuman();
        black.getColor();
        black.talk();
        black.getSex();
    }
}
