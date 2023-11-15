package christmas.controller;

import christmas.giveaway.GiveAway;

public class GiveAwayValidator {
    private static final int CHAMPAGNE_EVENT_MINIMUM_ORIGINAL_PRICE = 120000;

    public static void comparePrice(GiveAway giveAwayEvent, int originalPrice) {
        if (originalPrice >= CHAMPAGNE_EVENT_MINIMUM_ORIGINAL_PRICE) {
            giveAwayEvent.doGiveAway(originalPrice);
        }
    }
}
