package christmas.Promotion;

public class WeekdayEvent implements Discount{
    private final String EVENT_NAME = "평일 할인";
    private static final int DESSERT_SALE_AMOUNT = 2023;
    private int salePrice;

    @Override
    public void doSale(int visitDate) {
    }

    @Override
    public void dosale(String[][] dessertMenuArray) {
       int numberOfDessert = 0;
        try{
            for (String count : dessertMenuArray[0]) {
                numberOfDessert += Integer.parseInt(count);
            }
        } catch (NumberFormatException e){
            throw new IllegalArgumentException();
        }

        salePrice = DESSERT_SALE_AMOUNT * numberOfDessert;
    }

    @Override
    public String getEventName() {
        return EVENT_NAME;
    }

    @Override
    public int getSalePrice() {
        return salePrice;
    }

    @Override
    public void doSale() {
    }
}
