package patternzen.ch04.example2;


public class PettyGirl implements IGoodBodyGirl, IGreatTempearmentGirl {
    private String name;

    public PettyGirl(String name) {
        this.name = name;
    }

    @Override
    public void goodLooking() {
        System.out.println(this.name + "---脸蛋很漂亮!");
    }

    @Override
    public void niceFigure() {
        System.out.println(this.name + "---身材非常棒!");
    }

    @Override
    public void greatTemperament() {
        System.out.println(this.name + "---气质非常好!");
    }
}
