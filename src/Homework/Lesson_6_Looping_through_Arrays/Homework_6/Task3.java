package Homework.Lesson_6_Looping_through_Arrays.Homework_6;

public class Task3 {
    public static void main(String[] args) {

//        Задача № 3
//
//        Создайте двумерный массив 5х5, заполните его какими-нибудь числами.
//
//                Напечатайте его таким образом, чтобы он сохранял форматирование (колонки были выровнены),
//                если числа в нем будут любыми от -99 до 999.

        int[][] array = {{4, 6, 9, 1, 4},
                {6, 7, 8, 9, -10},
                {11, 999, 15, -14, 15},
                {16, 17, 18, 69, 20},
                {21, -99, 23, 24, 632}};

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.printf("%4d", array[i][j]);
            }
            System.out.println();
        }
    }
}
