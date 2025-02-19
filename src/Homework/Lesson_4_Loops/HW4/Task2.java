package Homework.Lesson_4_Loops.HW4;

public class Task2 {
    public static void main(String[] args) {

        /*Задача №2

        Необходимо вывести все положительные степени числа 5 до тех пор,
        пока результат возведения в степень меньше 100000,
         вывести результат возведения в степень.
*/

        int n = 1;
        double res = 0;
        while (res < 100000) {
            res = Math.pow(5, n);
            System.out.println("5 в степени " + n + " = " + res);
            n++;
        }
    }
}
