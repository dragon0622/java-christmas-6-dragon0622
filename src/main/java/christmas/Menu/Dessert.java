package christmas.Menu;

public enum Dessert {
    CHOCOLATE_CAKE("초코케이크",15000, 0),
    ICE_CREAM("아이스크림",5000, 0);

    String name;
    int price;
    int count;

    Dessert(String name, int price, int count) {
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
