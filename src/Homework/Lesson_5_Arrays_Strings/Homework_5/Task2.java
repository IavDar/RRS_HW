package Homework.Lesson_5_Arrays_Strings.Homework_5;

public class Task2 {
    public static void main(String[] args) {

        /*Задача №2

        Дан массив:
        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        необходимо вывести все значения массива больше 5.*/


        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        for (int j : array) {
            if (j > 5) {
                System.out.println(j);
            }
        }
    }
}
