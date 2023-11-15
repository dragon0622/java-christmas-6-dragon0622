package christmas;

import christmas.View.InputView;
import christmas.View.OutputView;

public class Application {
    public static int VISIT_DATE;
    public static String[][] ORDER;
    public static void main(String[] args) {
        OutputView.startMessage();

        VISIT_DATE = InputView.readDate();
        ORDER = InputView.readOrder();

        OutputView.eventInformation(VISIT_DATE);

        Planner planner = new Planner(VISIT_DATE, ORDER);
        planner.createEventPlanner(ORDER);

    }
}
