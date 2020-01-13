package patternzen.ch03.v1;

// client 是高层业务逻辑
public class Client {
    public static void main(String[] args) {
        IDriver zhangSan = new Driver();
        ICar benz = new Benz();
        zhangSan.drive(benz);
    }
}
