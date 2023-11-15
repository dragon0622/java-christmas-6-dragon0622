package christmas.Promotion;

import christmas.IllegalArgumentExceptionHandler;
import christmas.domain.Menu.MainDish;
import christmas.domain.Menu.Menu;

public class WeekendEvent implements Discount{
    private final String EVENT_NAME = "주말 할인";
    private static final int MAIN_SALE_AMOUNT = 2023;
    private int salePrice;


    @Override
    public void doSale() {
    }

    @Override
    public void doSale(int visitDate) {
    }

    @Override
    public void doSale(String[][] order) {
        int numberOfMain = 0;

        for(String[] menus : order){
            String name = menus[0];
            String quantity = menus[1];
            for (Menu menu : Menu.getAllItems()){
                numberOfMain += countMain(name, quantity, menu);
            }
        }

        salePrice = MAIN_SALE_AMOUNT * numberOfMain;
    }

    private int countMain(String name, String quantity, Menu menu) {
        try{
            if (menu.getName().equals(name)){
                if (menu instanceof MainDish){
                    return Integer.parseInt(quantity);
                }
            }
        } catch (NumberFormatException e){
            throw new IllegalArgumentException(name + "의 개수가 정수가 아닙니다.");
        } catch (IllegalArgumentException e){
            new IllegalArgumentExceptionHandler(e.getMessage());
        }
        return 0;
    }

    @Override
    public String getEventName() {
        return EVENT_NAME;
    }

    @Override
    public int getSalePrice() {
        return salePrice;
    }
}
