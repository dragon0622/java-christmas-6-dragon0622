package christmas.Menu;

public enum MainDish {
    T_BONE_STEAK("티본스테이크",55000, 0),
    BBQ_RIBS("바비큐립",54000, 0),
    SEAFOOD_PASTA("양송이수프",35000, 0),
    CHRISTMAS_PASTA("크리스마스파스타",25000, 0);

    String name;
    int price;
    int count;

    MainDish(String name, int price, int count) {
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
