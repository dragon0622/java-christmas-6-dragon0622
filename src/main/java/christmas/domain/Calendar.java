package christmas.domain;

public class Calendar {
    private static final String[] DAYS_OF_WEEK = {"월", "화", "수", "목", "금", "토", "일"};
    private static final String START_DAY = "금";
    private static int dayIndex;

    public static String findDayOfWeek(int visitDate) {
        setDayIndex();
        String dayOfVisitDate = DAYS_OF_WEEK[visitDate % 7 + dayIndex - 1];
        return dayOfVisitDate;
    }

    private static void setDayIndex() {
        for (int i = 0; i < DAYS_OF_WEEK.length; i++) {
            if (DAYS_OF_WEEK[i].equals(START_DAY)) {
                dayIndex = i;
            }
        }
    }
}
