package christmas.Promotion;

public interface Discount {

    void doSale();
    void doSale(int visitDate);

    void dosale(String[][] eventMenuArray);

    String getEventName();

    int getSalePrice();
}
