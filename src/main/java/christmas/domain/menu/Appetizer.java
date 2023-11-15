package christmas.domain.menu;

public enum Appetizer implements Menu {
    BUTTON_MUSHROOM_SOUP("양송이수프", 6000),
    TAPAS("타파스", 5500),
    CAESAR_SALAD("양송이수프", 8000);

    private String name;
    private int price;

    Appetizer(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getPrice() {
        return price;
    }

}
