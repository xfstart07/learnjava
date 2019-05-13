package patternzen.ch22.example2;

import java.util.ArrayList;

// 被观察者
public class HanFeiZi implements IHanFeiZi, Observable {
    private ArrayList<Observer> observers = new ArrayList<Observer>();

    @Override
    public void haveBreakfast() {
        System.out.println("韩非子：开始吃饭了...");
        this.notifyObservers("韩非子开始吃饭了");
    }

    @Override
    public void haveFun() {
        System.out.println("韩非子：开始娱乐...");
        this.notifyObservers("韩非子开始娱乐");
    }

    @Override
    public void addObserver(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void deleteObserver(Observer observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notifyObservers(String context) {
        for (Observer observer:observers) {
            observer.update(context);
        }
    }
}
