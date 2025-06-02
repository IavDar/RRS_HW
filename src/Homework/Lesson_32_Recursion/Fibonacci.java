package Homework.Lesson_32_Recursion;

public class Fibonacci {

    public static void main(String[] args) {
        int count = 10;
        System.out.println("Ряд Фибоначчи без рекурсии");
        fibon(count);

        System.out.println("Ряд Фибоначчи c рекурсией");

        for (int i = 0; i < count; i++) {
            System.out.println(recursFib(i));
        }
    }

    // ряд фибоначи без рекурсии:

    public static void fibon(int n) {
        int a = 0;
        int b = 1;
        for (int i = 0; i < n; i++) {
            System.out.println(a);
            int next = a + b;
            a = b;
            b = next;
        }
    }

    // ряд фибоначи с рекурсией:
    public static int recursFib(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n should be >=0");
        }
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return recursFib(n - 1) + recursFib(n - 2);
    }
}
