package patternzen.ch16.example2;

import java.util.ArrayList;
import java.util.Random;

public class Client {

//    我们可以抽象成这样一个结构，女性的请求先发送到父亲类，父亲类一看是自己要处理的，就作出回应处理，
//    如果女儿已经出嫁了，那就要把这个请求转发到女婿来处理，那女婿一旦去天国报道了，那就由儿子来处理这个请求，类似于如图16-2所示的顺序处理图。
    public static void main(String[] args) {
        Random rand = new Random();
        ArrayList<IWomen> list = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            list.add(new Women(rand.nextInt(4), "我要去逛街"));
        }

        //定义三个请示对象
        Handler father = new Father();
        Handler husband = new Husband();
        Handler son = new Son();

        //设置请示顺序
        father.setNext(husband);
        husband.setNext(son);
        for (IWomen women:list) {
            father.HandleMessage(women);
        }
    }
}
