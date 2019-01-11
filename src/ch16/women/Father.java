package ch16.women;

public class Father implements IHandler {
    @Override
    public void HandleMessage(IWomen women) {
        System.out.println("女儿的请示是：" + women.getRequest());

        System.out.println("父亲回答是：同意");
    }
}
