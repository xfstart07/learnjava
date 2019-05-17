package patternzen.ch04.example2;

public class Searcher extends AbstractSearcher {
    public Searcher(IGoodBodyGirl girl) {
        super(girl);
    }

    public Searcher(IGreatTempearmentGirl girl) {
        super(girl);
    }

    @Override
    public void show() {
        System.out.println("--------美女的信息如下：---------------");
        if (super.goodBodyGirl != null) {
            super.goodBodyGirl.goodLooking();
            super.goodBodyGirl.niceFigure();
        }

        if (super.greatTempearmentGirl != null) {
            super.greatTempearmentGirl.greatTemperament();
        }
    }
}
