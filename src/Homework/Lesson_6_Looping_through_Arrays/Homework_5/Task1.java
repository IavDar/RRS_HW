package Homework.Lesson_6_Looping_through_Arrays.Homework_5;

public class Task1 {

    public static void main(String[] args) {

        /* Задача №1

    Дан массив:
    int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
    необходимо вывести сумму всех значений массива.*/

        System.out.println("Task 1");

        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        int sum = 0;
        for (int j : array) {
            sum += j;
        }
        System.out.println(sum);

//        Задача №2
//
//        Дан массив:
//        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
//        необходимо вывести максимальное значение массива.

        System.out.println("Task 2");

        int max = array[0];
        for (int j : array) {
            if (j > max) {
                max = j;
            }
        }
        System.out.println(max);

//        Задача №3
//
//        Дан массив:
//        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
//        необходимо вывести минимальное значение массива.

        System.out.println("Task 3");

        int min = array[0];
        for (int j : array) {
            if (j < min) {
                min = j;
            }
        }
        System.out.println(min);

//        Задача №4
//
//        Дан массив:
//        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
//        необходимо вывести среднее арифметическое всех значений массива.

        System.out.println("Task 4");
        int[] array2 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int sum2 = 0;

        for (int j : array2) {
            sum2 += j;
        }
        double arithmeticMean = sum2 * 1.0 / array2.length;
        System.out.println("The arithmetic mean of all values of the array: " + arithmeticMean);
    }
}
