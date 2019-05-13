package patternzen.ch22.example2;


public class Client {
    public static void main(String[] args) throws InterruptedException {
        Observer liSi = new LiSi();
        Observer wangSi = new WangSi();

        HanFeiZi hanFeiZi = new HanFeiZi();
        hanFeiZi.addObserver(liSi);
        hanFeiZi.addObserver(wangSi);

        hanFeiZi.haveBreakfast();
    }
}
