package Homework.Lesson_24_Lambda_Comparator_Enum;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Lesson24 {
    public static void main(String[] args) {
        List <Integer> ints = new ArrayList<>(List.of(5, 4, 6, -56, 0, -58));
        System.out.println(ints);

        ints.removeIf(x -> x > 0); //изменяет существующий список
        System.out.println(ints);

        ints.replaceAll(x -> x * x); //изменяет существующий список
        System.out.println(ints);

        ints.forEach(a -> System.out.println(">>" + a));

        ints.sort(Comparator.naturalOrder()); // сортировка
        System.out.println(ints);

    }
}
