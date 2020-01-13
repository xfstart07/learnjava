package patternzen.ch07.v1;

public class Emperor {
    private static Emperor emperor = new Emperor();

    private Emperor() {
        // 不希望产生第二个对象
        // 避免被其他类 new 出来一个对象
    }

    public static Emperor getInstance() {
        return emperor;
    }

    public static void say() {
        System.out.println("我就是皇帝某某某....");
    }

}
