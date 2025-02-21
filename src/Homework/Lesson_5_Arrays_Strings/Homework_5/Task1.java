package Homework.Lesson_5_Arrays_Strings.Homework_5;

public class Task1 {
    public static void main(String[] args) {

        /*
        Задача №1

        Дан массив:
        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        необходимо вывести все нечетные числа из массива.
        */

        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        for (int i =0; i < array.length; i++) {
            if (array [i] % 2 == 1) {
                System.out.println(array[i]);
            }
        }
    }
}
