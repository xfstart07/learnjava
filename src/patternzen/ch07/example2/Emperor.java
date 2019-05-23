package patternzen.ch07.example2;

public class Emperor {
    private static Emperor emperor = null;

    private Emperor() {
        // 不希望产生第二个对象
        // 避免被其他类 new 出来一个对象
    }

    public synchronized static Emperor getInstance() {
        if (emperor == null) {
            emperor = new Emperor();
        }
        return emperor;
    }

    public static void say() {
        System.out.println("我就是皇帝某某某....");
    }

}
