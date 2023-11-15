package christmas.domain.menu;

import java.util.Arrays;
import java.util.stream.Stream;

public interface Menu {
    String getName();

    int getPrice();

    static Menu[] getAllItems() {
        return Stream.of(Appetizer.values(), MainDish.values(), Dessert.values(), Drink.values())
                .flatMap(Arrays::stream)
                .toArray(Menu[]::new);
    }
}
