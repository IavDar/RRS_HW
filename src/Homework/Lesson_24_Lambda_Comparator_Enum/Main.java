package Homework.Lesson_24_Lambda_Comparator_Enum;

public class Main {
    public static void main(String[] args) {
//        DayOfWeek today = DayOfWeek.TUESDAY;
//        System.out.println(today);
//        System.out.println(Arrays.toString(DayOfWeek.values()));
//        System.out.println(DayOfWeek.TUESDAY.compareTo(DayOfWeek.WEDNESDAY));
//        System.out.println(DayOfWeek.valueOf("MONDAY"));

//        Animal animal = Animal.CAT;
//        System.out.println(animal.toString());

        DayOfWeek today = DayOfWeek.TUESDAY;

        if (today.isWorkDay()) {
            System.out.println(today + " — рабочий день");
        } else {
            System.out.println(today + " — выходной");
        }
    }
}
