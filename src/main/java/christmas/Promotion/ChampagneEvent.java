package christmas.Promotion;

import christmas.GiveAway.GiveAway;
import christmas.Menu.Drink;
import christmas.View.OutputView;

public class ChampagneEvent implements GiveAway {
    private static final String EVENT_NAME = "";
    private static final int MINIMUM_ORIGINAL_PRICE = 120000;
    private static final String GIFT_KOR_NAME = Drink.CHAMPAGNE.getName();
    private static final int GIFT_NUM = 1;

    @Override
    public boolean isGiveAway(int originalPrice) {
        if (originalPrice > MINIMUM_ORIGINAL_PRICE){
            return true;
        }
        return false;
    }

    @Override
    public String getMenuKorName() {
        return null;
    }

    @Override
    public String getEventName() {
        return EVENT_NAME + "증정 이벤트";
    }

    @Override
    public int getMenuPrice() {
        return 0;
    }

    @Override
    public int getNumberOfMenu() {
        return 0;
    }
}
