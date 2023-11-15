package christmas;

import christmas.Badge.BadgeGrant;

public class GiveAwayValidator {
    public static void comparePrice(BadgeGrant badgeGrantEvent, int benefitPrice){
        badgeGrantEvent.doGrant(benefitPrice);
    }
}
