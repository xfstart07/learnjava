package patternzen.ch18.v1;

public class Context {

    private IStrategy strategy;

    public Context(IStrategy _strategy) {
        this.strategy = _strategy;
    }

    public void operate() {
        this.strategy.operate();
    }
}
