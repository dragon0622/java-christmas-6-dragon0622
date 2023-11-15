package christmas;

import christmas.Badge.BadgeGrant;

public class BadgeGrantValidator {
    public static void comparePrice(BadgeGrant badgeGrantEvent, int benefitPrice){
        badgeGrantEvent.doGrant((benefitPrice));
    }
}
