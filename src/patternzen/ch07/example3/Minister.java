package patternzen.ch07.example3;

public class Minister {
    public static void main(String[] args) {
        for(int day = 0; day < 5; day++) {
            Emperor emperor = Emperor.getInstance();
            emperor.say();
        }
    }
}
