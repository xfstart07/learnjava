package patternzen.ch16.v1;

import java.util.ArrayList;
import java.util.Random;

public class Client {
    public static void main(String[] args) {
        Random rand = new Random();
        ArrayList<IWomen> list = new ArrayList<>();

        for (int i=0; i<5;i++) {
            list.add(new Women(rand.nextInt(4), "我要去逛街"));
        }

        IHandler father = new Father();
        IHandler husband = new Husband();
        IHandler son  = new Son();

        for (IWomen women:list) {
            if (women.getType() == 1) {
                System.out.println("\n--------女儿向父亲请示-------");
                father.HandleMessage(women);
            } else if (women.getType() == 2) {
                System.out.println("\n--------妻子向丈夫请示-------");
                husband.HandleMessage(women);
            } else if (women.getType() == 3) {
                System.out.println("\n--------母亲向儿子请示-------");
                son.HandleMessage(women);
            }
        }
    }
}
