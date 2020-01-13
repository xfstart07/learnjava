package patternzen.ch07.v3;

import java.util.ArrayList;
import java.util.Random;

public class Emperor {
    private static int maxNumOfEmperor = 2;
    private static ArrayList<String> nameList = new ArrayList<>();
    private static ArrayList<Emperor> emperors = new ArrayList<>();

    private static int countNumOfEmperor = 0;

    static {
        for (int i=0; i<maxNumOfEmperor; i++) {
            emperors.add(new Emperor("皇" + (i+1) +"帝"));
        }
    }

    private Emperor() {
        // 不希望产生第二个对象
        // 避免被其他类 new 出来一个对象
    }

    private Emperor(String name) {
        nameList.add(name);
    }

     public static Emperor getInstance() {
        Random random = new Random();
        countNumOfEmperor = random.nextInt(maxNumOfEmperor);
        return emperors.get(countNumOfEmperor);
    }

    public static void say() {
        System.out.println("我是" + nameList.get(countNumOfEmperor));
    }

}
