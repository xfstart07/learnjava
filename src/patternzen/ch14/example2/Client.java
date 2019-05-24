package patternzen.ch14.example2;

public class Client {
    public static void main(String[] args) {
        AbstractMediator mediator=  new Mediaor();

        System.out.println("------采购人员采购电脑--------");
        Purchase purchase = new Purchase(mediator);
        purchase.buyIBMcomputer(100);

        System.out.println("\n------销售人员销售电脑--------");
        Sale sale = new Sale(mediator);
        sale.sellIMBComputer(1);

        Stock stock = new Stock(mediator);
        stock.clearStock();
    }
}
