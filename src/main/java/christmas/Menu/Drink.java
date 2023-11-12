package christmas.Menu;

public enum Drink {
    ZERO_COKE("제로콜라",3000, 0),
    RED_WINE("레드와인",60000, 0),
    CHAMPAGNE("샴페인",25000, 0);

    String name;
    int price;
    int count;

    Drink(String name, int price, int count) {
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
