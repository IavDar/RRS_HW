package Homework.Lesson_5_Arrays_Strings.Homework_5;

public class Task6 {
/*    Задача №6

    Дан массив:
    int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
    необходимо вывести сумму всех значений массива.*/

    public static void main(String[] args) {

        int [] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println(sum);
    }
}

/*
for (int j : array) {  вариант с циклом for-each
sum += j;
        }
*/
