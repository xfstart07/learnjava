package patternzen.ch22.v2;

public interface Observable {
    public void addObserver(Observer observer);
    public void deleteObserver(Observer observer);
    public void notifyObservers(String context);
}
