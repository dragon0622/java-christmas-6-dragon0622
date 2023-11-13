package christmas.Promotion;

import christmas.Menu.Drink;
import christmas.View.OutputView;

public class ChampagneEvent implements GiveAway {
    private static final int MINIMUM_ORIGINAL_PRICE = 120000;
    private static final String GIFT_KOR_NAME = Drink.CHAMPAGNE.getName();
    private static final int GIFT_NUM = 1;

    @Override
    public boolean doGiveAway(int originalPrice) {
        if (originalPrice > MINIMUM_ORIGINAL_PRICE){
            OutputView.giveawayMessage(getMenuKorName(),getNumberOfMenu());
            return true;
        }
        return false;
    }

    @Override
    public String getMenuKorName() {
        return null;
    }

    @Override
    public int getNumberOfMenu() {
        return 0;
    }
}
