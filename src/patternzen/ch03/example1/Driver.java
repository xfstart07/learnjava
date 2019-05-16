package patternzen.ch03.example1;

public class Driver implements IDriver {
    @Override
    public void drive(ICar car) {
        car.run();
    }
}
