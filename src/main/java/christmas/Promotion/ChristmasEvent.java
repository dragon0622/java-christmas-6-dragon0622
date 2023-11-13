package christmas.Promotion;

public class ChristmasEvent implements Discount{
    private int salePrice = 0;
    private static final int START_SALE_AMOUNT = 1000;
    private static final int INCREASE_SALE_AMOUNT = 100;

    public int findSalePrice(int visitDate){
        return START_SALE_AMOUNT + (visitDate - 1) * INCREASE_SALE_AMOUNT;
    }

    @Override
    public int doSale(int originalPrice) {
        return originalPrice - salePrice;
    }
}
