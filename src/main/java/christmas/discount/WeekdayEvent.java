package christmas.discount;

import christmas.exception.IllegalArgumentExceptionHandler;
import christmas.domain.menu.Dessert;
import christmas.domain.menu.Menu;

public class WeekdayEvent implements Discount {
    private final String EVENT_NAME = "평일 할인";
    private static final int DESSERT_SALE_AMOUNT = 2023;
    private int salePrice;

    @Override
    public void doSale() {
    }

    @Override
    public void doSale(int visitDate) {
    }

    @Override
    public void doSale(String[][] order) {
        int numberOfDessert = 0;

        for (String[] menus : order) {
            String name = menus[0];
            String quantity = menus[1];
            for (Menu menu : Menu.getAllItems()) {
                numberOfDessert += countDessert(name, quantity, menu);
            }
        }

        salePrice = -(DESSERT_SALE_AMOUNT * numberOfDessert);
    }

    private int countDessert(String name, String quantity, Menu menu) {
        try {
            if (menu.getName().equals(name)) {
                if (menu instanceof Dessert) {
                    return Integer.parseInt(quantity);
                }
            }
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException(name + "의 개수가 정수가 아닙니다.");
        } catch (IllegalArgumentException e) {
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
