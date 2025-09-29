package Homework.Lesson_12_Abstract_Classes.Homework_12;

//Создать неизменяемый (immutable) класс Month с полями: имя месяца,
////    количеством дней и количеством рабочих дней. Поля должны быть спрятаны,
////    для каждого поля создать getter.

public class Month {

    private final String monthName; // final - значение нельзя менять (ссылку)
    private final int daysAmount;
    private final int workingDaysAmount;

    public Month(String monthName, int daysAmount, int workingDaysAmount) {
        this.monthName = monthName;
        this.daysAmount = daysAmount;
        this.workingDaysAmount = workingDaysAmount;
    }

    public String getMonthName() {
        return monthName;
    }

    public int getDaysAmount() {
        return daysAmount;
    }

    public int getWorkingDaysAmount() {
        return workingDaysAmount;
    }


}
