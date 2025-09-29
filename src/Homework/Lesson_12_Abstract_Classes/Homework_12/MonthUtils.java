package Homework.Lesson_12_Abstract_Classes.Homework_12;

//    Создать класс MonthUtils который бы хранил подготовленные месяцы
//    или их массивы для использования (объекты класса Month).
//

public class MonthUtils {

    public static final Month JANUARY = new Month("Январь", 31, 20);
    public static final Month FEBRUARY = new Month("Февраль", 31, 20);
    public static final Month MARCH = new Month("Март", 31, 21);
    public static final Month APRIL = new Month("Апрель", 30, 21);
    public static final Month MAI = new Month("Май", 31, 20);
    public static final Month JUNE = new Month("Июнь", 30, 21);
    public static final Month JULY = new Month("Июль", 31, 22);
    public static final Month AUGUST = new Month("Август", 31, 21);
    public static final Month SEPTEMBER = new Month("Сентябрь", 30, 21);
    public static final Month OCTOBER = new Month("Октябрь", 31, 22);
    public static final Month NOVEMBER = new Month(  "Ноябрь", 30, 21);
    public static final Month DECEMBER = new Month("Декабрь", 31, 21);

    public static final Month[] MONTHS = {
            JANUARY, FEBRUARY, MARCH, APRIL, MAI, JUNE, JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER
    };

}
