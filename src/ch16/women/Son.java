package ch16.women;

public class Son implements IHandler {
    @Override
    public void HandleMessage(IWomen women) {
        System.out.println("母亲的请示是：" + women.getRequest());

        System.out.println("儿子回答是：同意");
    }
}
