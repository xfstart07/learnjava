package patternzen.ch08.example1;

public abstract class AbsstractHumanFactory {
    // 泛型，参数产生两层限制：
    // 必须是 Class 类型
//    必须是 IHuman 的实现类
    public abstract <T extends IHuman> T createHuman(Class<T> c);
}
