package patternzen.ch14.v1;

import java.util.Random;

public class Sale {
    public void sellIMBComputer(int number) {
        Stock stock = new Stock();
        Purchase purchase = new Purchase();
        if (stock.getStockNumber() < number) {
            purchase.buyIBMcomputer(number);
        }

        stock.decrease(number);
    }

    public int getSaleStatus() {
        Random rand = new Random(System.currentTimeMillis());
        int saleStatus = rand.nextInt(100);
        System.out.println("IBM电脑的销售情况为："+saleStatus);
        return saleStatus;
    }

    public void offSale() {
        Stock stock = new Stock();
        System.out.println("折价销售IBM电脑"+stock.getStockNumber()+"台");
    }
}
