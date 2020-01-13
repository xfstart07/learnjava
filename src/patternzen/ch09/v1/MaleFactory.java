package patternzen.ch09.v1;

public class MaleFactory implements HumanFactory {
    @Override
    public IHuman createYellowHuman() {
        return new MaleYellowHuman();
    }

    @Override
    public IHuman createWhiteHuman() {
        return new MaleWhiteHuman();
    }

    @Override
    public IHuman createBlackHuman() {
        return new MaleBlackHuman();
    }
}
