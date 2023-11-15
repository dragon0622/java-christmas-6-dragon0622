package christmas.Promotion;

public interface Discount {

    void doSale();
    void doSale(int visitDate);

    void doSale(String[][] eventMenuArray);

    String getEventName();

    int getSalePrice();
}
