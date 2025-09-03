package Homework.Lesson_5_Arrays_Strings.Homework_5;

public class Task7 {
//    Задача №7
//            Имеется 20 коробок спичек. Найти все коробки, количество спичек в которых отличается от среднего количества
//            больше, чем на 3. Например, если есть следующие данные:
//            60, 59, 58, 59, 64, 60,
//    то среднее количество будет чуть меньше 60. Соответственно, коробка с 64 спичками будет сильно отличаться от среднего.

    public static void main(String[] args) {

        int[] matchbox = {50, 52, 48, 50, 43, 55, 52, 51, 50, 51, 47, 46, 60, 54, 50, 45, 44, 53, 60, 52};
        int sum = 0;
        double avg;
        for (int j : matchbox) {
            sum += j;
        }
        avg = (double) sum / matchbox.length; // sum * 1.0 вариант приведения к double

        System.out.println("Average number of matches: " + avg);

        System.out.println("Boxes where number of matches differs from average by more than 3: ");

        for (int j : matchbox) {
            if ((Math.abs(avg - j ) > 3)) {  // Math.abs() возвращает модуль числа (j < avg - 3 || j > avg + 3)
                System.out.print(j + " ");
            }
        }
    }
}
