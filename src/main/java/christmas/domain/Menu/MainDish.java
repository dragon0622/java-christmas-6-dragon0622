package christmas.domain.Menu;

public enum MainDish implements Menu{
    T_BONE_STEAK("티본스테이크",55000),
    BBQ_RIBS("바비큐립",54000),
    SEAFOOD_PASTA("양송이수프",35000),
    CHRISTMAS_PASTA("크리스마스파스타",25000);

    String name;
    int price;

    MainDish(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

}
