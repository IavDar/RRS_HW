package Homework.Lesson_4_Loops.HW4;

public class Task3 {
    public static void main(String[] args) {

        /*Задача №3

        Необходимо вывести все числа кратные 4 между числами 40 и 60 включительно.
                Реализовать 2 варианта:
        использовать конструкцию if для определения кратности (цикл с шагом 1, i = i + 1);
        без использования конструкции if (шаг цикла на ваше усмотрение).*/


        System.out.println("Первый вариант:");

        for (int n = 40; n <= 60; n++) {
            if (n % 4 == 0) {
                System.out.println(n);
            }
        }


        System.out.println("Второй вариант:");

        for (int n = 40; n <= 60; n += 4) {
                System.out.println(n);
        }
    }
}
