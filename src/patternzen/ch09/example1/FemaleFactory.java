package patternzen.ch09.example1;

public class FemaleFactory implements HumanFactory {
    @Override
    public IHuman createYellowHuman() {
        return new FemaleYellowHuman();
    }

    @Override
    public IHuman createWhiteHuman() {
        return new FemaleWhiteHuman();
    }

    @Override
    public IHuman createBlackHuman() {
        return new FemaleBlackHuman();
    }
}
