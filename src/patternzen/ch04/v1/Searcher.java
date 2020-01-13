package patternzen.ch04.v1;

public class Searcher extends AbstractSearcher {
    public Searcher(IPettyGirl girl) {
        super(girl);
    }

    @Override
    public void show() {
        System.out.println("--------美女的信息如下：---------------");
        super.pettyGirl.goodLooking();
        super.pettyGirl.niceFigure();
        super.pettyGirl.greatTemperament();
    }
}
