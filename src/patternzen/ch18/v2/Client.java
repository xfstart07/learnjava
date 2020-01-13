package patternzen.ch18.v2;

import java.util.Arrays;

public class Client {
    public static void main(String[] args) {
        String[] args2 = {"1", "+", "2"};

        int a = Integer.parseInt(args2[0]);
        String symbol = args2[1];
        int b = Integer.parseInt(args2[2]);

        System.out.println("输入的参数为："+Arrays.toString(args2));
        if (symbol.equals("+")) {
            System.out.println("运行结果为："+a+symbol+b+"="+Calculator.ADD.exec(a,b));
        }else {
            System.out.println("运行结果为："+a+symbol+b+"="+Calculator.SUB.exec(a,b));
        }
    }
}
