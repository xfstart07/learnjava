package patternzen.ch04.v1;

public abstract class AbstractSearcher {
    protected IPettyGirl pettyGirl;

    public AbstractSearcher(IPettyGirl girl) {
        this.pettyGirl = girl;
    }

    public abstract void show();
}
