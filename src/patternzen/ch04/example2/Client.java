package patternzen.ch04.example2;


public class Client {
    public static void main(String[] args) {
        IGreatTempearmentGirl yanYan = new PettyGirl("妍妍");
        AbstractSearcher searcher = new Searcher(yanYan);
        searcher.show();
    }
}
