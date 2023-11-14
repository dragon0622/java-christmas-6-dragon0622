package christmas.GiveAway;

public interface GiveAway {
    boolean isGiveAway(int originalPrice);
    String getMenuKorName();
    String getEventName();
    int getMenuPrice();
    int getNumberOfMenu();
}
