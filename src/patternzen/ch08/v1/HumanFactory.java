package patternzen.ch08.v1;

public class HumanFactory extends AbsstractHumanFactory {

    @Override
    public <T extends IHuman> T createHuman(Class<T> c) {
        IHuman human = null;
        try {
            human = (T)Class.forName(c.getName()).newInstance();
        } catch (Exception e) {
            System.out.println("错误");
        }

        return (T)human;
    }
}
