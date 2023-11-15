package christmas;

import christmas.Badge.BadgeGrant;
import christmas.Badge.DecemberEvent;
import christmas.GiveAway.GiveAway;
import christmas.Promotion.*;
import christmas.View.OutputView;
import christmas.domain.Menu.*;
import christmas.domain.*;

import java.util.List;

public class Planner {

    private int originalPrice;
    private int salePrice;
    private int giftPrice;
    private final String visitDay;

    private final List<Discount> discountEvents = List.of(new ChristmasEvent(), new WeekdayEvent(), new WeekendEvent(), new SpecialEvent());
    private final List<GiveAway> giveAwayEvents = List.of(new ChampagneEvent());
    private final List<BadgeGrant> badgeGrantEvents = List.of(new DecemberEvent());


    Planner(int visitDate, String[][] order) {
        this.visitDay = Calendar.findDayOfWeek(visitDate);
        this.originalPrice = getOriginalPrice(order);
    }

    private int getOriginalPrice(String[][] order) {
        for (String[] item : order){
            String name = item[0];
            String quantity = item[1];

            originalPrice += calculateItemPrice(name, quantity);
        }
        return originalPrice;
    }

    private int calculateItemPrice(String name, String quantity){
        try{
            for(Menu menu : Menu.getAllItems()){
                if (menu.getName().equals(name)){
                    return menu.getPrice() * Integer.parseInt(quantity);
                }
            }
            throw new IllegalArgumentException(name + "은/는 없는 메뉴 입니다.");
        } catch (NumberFormatException e){
            throw new IllegalArgumentException("유효하지 않은 주문입니다. 다시 입력해 주세요.");
        } catch (IllegalArgumentException e){
            new IllegalArgumentException(e.getMessage());
        }
        return 0;
    }


    private void applyEvents(String[][] order){
        if (originalPrice < 10000){
            return;
        }
        for (Discount discountEvent : discountEvents){
            DiscountValidator.doDiscount(discountEvent, visitDay,order);
            salePrice += discountEvent.getSalePrice();
        }
        for (GiveAway giveAwayEvent : giveAwayEvents){
            GiveAwayValidator.comparePrice(giveAwayEvent, originalPrice);
            if (giveAwayEvent.getIsApplied()) {
                giftPrice += giveAwayEvent.getMenuPrice();
            }
        }
        for (BadgeGrant badgeGrantEvent : badgeGrantEvents){
            BadgeGrantValidator.comparePrice(badgeGrantEvent, salePrice+giftPrice);
        }
    }

    public void createEventPlanner(String[][] order) {
        OutputView.printMenu(order);
        OutputView.printBeforeSale(originalPrice);

        applyEvents(order);

        OutputView.printGetFree();
        if (giftPrice != 0){
            giveAwayEvents.forEach(OutputView::giveAwayMessage);
        }
        else if (giftPrice == 0){
            OutputView.nothingMessage();
        }

        OutputView.printAllBenefit();
        if ((salePrice + giftPrice) != 0){
            discountEvents.forEach(OutputView::printDiscountBenefitList);
            giveAwayEvents.forEach(OutputView::printGiveAwayBenefitList);
        }
        else if ((salePrice+giftPrice) == 0){
            OutputView.nothingMessage();
        }
        OutputView.printTotalBenefitPrice(salePrice + giftPrice);
        OutputView.printAfterSale(originalPrice + salePrice);
        OutputView.printEventBadge();
        for (BadgeGrant badgeGrantEvent : badgeGrantEvents){
            OutputView.printBadge(badgeGrantEvent);
        }
    }
}
