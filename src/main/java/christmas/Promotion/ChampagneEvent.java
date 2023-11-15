package christmas.Promotion;

import christmas.GiveAway.GiveAway;
import christmas.domain.Menu.Drink;

public class ChampagneEvent implements GiveAway {
    private static final String EVENT_NAME = "";
    private static boolean isApplied = false;
    private static final String GIFT_NAME = Drink.CHAMPAGNE.getName();
    private static final int GIFT_PRICE = -(Drink.CHAMPAGNE.getPrice());
    private static final int GIFT_NUM = 1;


    @Override
    public void doGiveAway(int originalPrice) {
        isApplied = true;
    }

    public boolean getIsApplied(){return isApplied;}

    @Override
    public String getMenuKorName() {
        return GIFT_NAME;
    }

    @Override
    public String getEventName() {
        return EVENT_NAME + "증정 이벤트";
    }

    @Override
    public int getMenuPrice() {
        return GIFT_PRICE;
    }

    @Override
    public int getNumberOfMenu() {
        return GIFT_NUM;
    }
}
