package patternzen.ch14.example1;

public class Client {
    public static void main(String[] args) {
        System.out.println("------采购人员采购电脑--------");
        Purchase purchase = new Purchase();
        purchase.buyIBMcomputer(100);

        System.out.println("\n------销售人员销售电脑--------");
        Sale sale = new Sale();
        sale.sellIMBComputer(1);

        Stock stock = new Stock();
        stock.clearStock();
    }
}
