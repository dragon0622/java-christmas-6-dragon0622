package christmas;

public class WeekendEvent implements Discount{
    private int salePrice;
    private static final int MAIN_SALE_AMOUNT = 2023;

    public void setSalePrice(String[][] mainMenuArray){
        int numberOfMain = 0;
        try{
            for (String count : mainMenuArray[0]){
                numberOfMain += Integer.parseInt(count);
            }

        }catch (NumberFormatException e){
            throw new IllegalArgumentException();
        }

        salePrice = MAIN_SALE_AMOUNT * numberOfMain;
    }


    @Override
    public int doSale(int originalPrice) {
        return originalPrice - salePrice;
    }
}
