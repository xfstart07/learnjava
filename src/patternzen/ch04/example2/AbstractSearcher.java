package patternzen.ch04.example2;

public abstract class AbstractSearcher {
    protected IGoodBodyGirl goodBodyGirl;
    protected IGreatTempearmentGirl greatTempearmentGirl;

    public AbstractSearcher(IGoodBodyGirl girl) {
        this.goodBodyGirl = girl;
    }

    public AbstractSearcher(IGreatTempearmentGirl girl) {
        this.greatTempearmentGirl = girl;
    }

    public abstract void show();
}
