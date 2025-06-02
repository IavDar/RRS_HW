package Homework.Lesson_24_Lambda_Comparator_Enum;

public enum DayOfWeek {
    MONDAY(true),
    TUESDAY(true),
    WEDNESDAY(true),
    THURSDAY(true),
    FRIDAY(true),
    SATURDAY(false),
    SUNDAY(false);

    private final boolean isWorkDay;

    DayOfWeek(boolean isWorkDay) {
        this.isWorkDay = isWorkDay;
    }

    public boolean isWorkDay() {
        return isWorkDay;
    }
}
