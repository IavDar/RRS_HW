package Homework.Lesson_26_Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Task1 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);
        numbers.add(10);

        List<Integer> result = numbers.stream()
                .filter(i -> i % 2 ==0)
                .map(x -> x*x)
                .toList();
        System.out.println(result); // Интерфейс Collection (включая List, Set, и т.д.) переопределяет toString()
        // в отличии от массивов (Чтобы вывести содержимое массива, нужно использовать Arrays.toString()).

        //Task2

        List<String> words = List.of("apple", "banana", "авокадо", "арбуз", "melon");
        List<String> result1 = words.stream()
                .filter(x -> x.startsWith("a") || x.startsWith("а"))
                .map(String::toUpperCase)
                .toList();
        System.out.println(result1);


        List<Integer> numb = List.of(43, 18, 34, 3, 64, 6, 0, 5, 8);
        List<Integer> res = numb.stream()
                .filter(x -> x% 2 ==0)
                .map(x -> x*x)
                .sorted()
                .toList();
        System.out.println(res);
    }
}
