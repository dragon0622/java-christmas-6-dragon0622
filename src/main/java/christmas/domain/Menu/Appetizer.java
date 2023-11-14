package christmas.domain.Menu;

public enum Appetizer {
    BUTTON_MUSHROOM_SOUP("양송이수프",6000, 0),
    TAPAS("타파스",5500, 0),
    CAESAR_SALAD("양송이수프",8000, 0);

    String name;
    int price;
    int count;

    Appetizer(String name, int price, int count) {
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
