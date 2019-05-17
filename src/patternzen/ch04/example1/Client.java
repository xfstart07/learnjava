package patternzen.ch04.example1;

public class Client {
    public static void main(String[] args) {
        IPettyGirl yanYan = new PettyGirl("妍妍");
        AbstractSearcher searcher = new Searcher(yanYan);
        searcher.show();
    }
}
