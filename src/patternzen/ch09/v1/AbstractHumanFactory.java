package patternzen.ch09.v1;

public abstract class AbstractHumanFactory {
    // 泛型，参数产生两层限制：
    // 必须是 Class 类型
//    必须是 IHuman 的实现类
    public abstract <T extends IHuman> T createHuman(Class<T> c);
}
