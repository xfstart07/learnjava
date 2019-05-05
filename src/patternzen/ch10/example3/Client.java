package patternzen.ch10.example3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Client {
    public static void main(String []args) {
        System.out.println("-------H1型号悍马--------");
        System.out.println("H1型号的悍马是否需要喇叭声响？0-不需要   1-需要");
        String type=(new BufferedReader(new InputStreamReader(System.in))).toString();

        HummerH1Model h1 = new HummerH1Model();
        if (type.equals("0")) {
            h1.setAlarm(false);
        }

        h1.run();

        HummerH2Model h2 = new HummerH2Model();
        h2.run();

    }
}
