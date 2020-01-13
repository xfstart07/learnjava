package patternzen.ch14.v2;

public abstract class AbstractMediator {
    protected Purchase purchase;
    protected Sale sale;
    protected Stock stock;

    public AbstractMediator() {
        // 这里偷懒重新定义了对象，应该采用 set 方式设置 colleague
        purchase = new Purchase(this);
        sale = new Sale(this);
        stock = new Stock(this);
    }

    public abstract void execute(String str, Object ...objects);
}
