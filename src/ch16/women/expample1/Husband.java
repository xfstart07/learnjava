package ch16.women.expample1;

public class Husband implements IHandler {
    @Override
    public void HandleMessage(IWomen women) {
        System.out.println("妻子的请示是：" + women.getRequest());

        System.out.println("丈夫回答是：同意");
    }
}
