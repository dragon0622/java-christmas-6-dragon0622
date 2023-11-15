package christmas;

import christmas.Badge.BadgeGrant;
import christmas.GiveAway.GiveAway;

public class GiveAwayValidator {
    private static final int CHAMPAGNE_EVENT_MINIMUM_ORIGINAL_PRICE = 120000;
    public static void comparePrice(GiveAway giveAwayEvent, int originalPrice){
        giveAwayEvent.doGiveAway(originalPrice);
    }
}
