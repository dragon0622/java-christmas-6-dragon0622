package christmas.giveaway;

public interface GiveAway {

    void doGiveAway(int originalPrice);

    boolean getIsApplied();

    String getMenuKorName();

    String getEventName();

    int getMenuPrice();

    int getNumberOfMenu();
}
