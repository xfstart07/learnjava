package ch16.women;

import java.util.ArrayList;
import java.util.Random;

public class Client {
    public static void main(String[] args) {
        Random rand = new Random();

        ArrayList<IWomen> list = new ArrayList<>();
        for (int i=0;i<5;i++) {
            list.add(new Women(rand.nextInt(4), "我要去逛街"));
        }

        IHandler father = new Father();
        IHandler hasband = new Husband();
        IHandler son = new Son();

        for (IWomen women : list) {
            if (women.getType() == 1) {
                father.HandleMessage(women);
            }else if (women.getType() == 2){
                hasband.HandleMessage(women);
            } else if (women.getType() ==3) {
                son.HandleMessage(women);
            }
        }
    }
}
