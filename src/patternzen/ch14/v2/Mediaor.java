package patternzen.ch14.v2;

public class Mediaor extends AbstractMediator {
    @Override
    public void execute(String str,Object...objects){
        if(str.equals("purchase.buy")){
            //采购电脑
            this.buyComputer((Integer)objects[0]);
        }else if(str.equals("sale.sell")){
            //销售电脑
            this.sellComputer((Integer)objects[0]);
        }else if(str.equals("sale.offsell")){
            //折价销售
            this.offSell();
        }else if(str.equals("stock.clear")){
            //清仓处理
            this.clearStock();
        }
    }

    private void buyComputer(int number) {
        int saleStatus = super.sale.getSaleStatus();
        if (saleStatus >  80 ) {
            System.out.println("采购IBM电脑:"+number + "台");
            stock.increase(number);
        } else {
            int buyNumber = number/2;
            stock.increase(buyNumber);
        }
    }

    private void sellComputer(int number ){
        if (super.stock.getStockNumber() < number) {
            super.purchase.buyIBMcomputer(number);
        }

        super.stock.decrease(number);
    }

    private void offSell() {
        System.out.println("折价销售IBM电脑"+super.stock.getStockNumber()+"台");
    }

    private void clearStock() {
        super.sale.offSale();
        super.purchase.refuseBuyIBM();
    }
}
