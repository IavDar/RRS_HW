package Lesson_2_Variables;

public class HomeWork2 {
    public static void main(String[] args) {


        // Задача №1: Необходимо создать целочисленные переменные a и b, присвоить произвольные
//        значения переменным на ваш выбор и вывести результаты следующих операций с
//        этими переменными: сложение, умножение, вычитание, деление и остаток от деления.
//        Также сделать проверку на четность этих переменных и вывести результат.


        int a = 55;
        int b = 6;

        System.out.println("a+b = " + (a+b));
        System.out.println("a*b = " + (a*b));
        System.out.println("a-b = " + (a-b));
        System.out.println("a/b = " + (a/b));
        System.out.println("Really, a/b = " + (a * 1.0 / b)); // a * 1.0 перевели a в double
        System.out.println("a % b = " + (a % b));

        if (a % 2 == 0) {
            System.out.println("Число " + a + " четное");
        }
        else {
            System.out.println("Число " + a + " нечетное");
        }

        if (b % 2 == 0) {
            System.out.println("Число " + b + " четное");
        }
        else {
            System.out.println("Число " + b + " нечетное");
        }

        // вариант проверки на четность от преподавателя, т.к. мы еще не проходили условные операторы:

        System.out.println("Являяется ли " + a + " четным числом? " + (a % 2 == 0));
        System.out.println("Являяется ли " + b + " четным числом? " + (b % 2 == 0));



        // Задача №2:

//        int a = 5;
//        int b = 2;
//        a = a + b; // 5 + 2 = 7
//        b = a - b;  // 7 - 2 = 5
//        a = a - b;  // 7 - 5 = 2
//        System.out.println("a = " + a + ", b = " + b);

        // Преподаватель предлагает делать через временную переменную
        // Во всех задачах можно вводить дополнительные переменные.

        int a1 = 5;
        int b1 = 2;
        int temp = a1;
        a1 = b1;
        b1 = temp;
        System.out.println("a1 = " + a1 + ", b1 = " + b1);


        // Задача №3:


        // мой вариант решения ( надо было остаток
        // поделить на всех остальных, включая капитана):

        double piastres = 2500;
        int numberOfPirates = 37;

        System.out.println("Владелец корабля получит " + piastres / 2 + ", капитан ролучит " + piastres / 4 +
                ", каждый из остальных членов команды получит по " + piastres / 4 / (numberOfPirates) + " пиастра.  \nДжек Воробей получит " + piastres * 3/ 4 + " пиастров.");


    }
}
