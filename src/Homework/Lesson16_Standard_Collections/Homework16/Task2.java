package Homework.Lesson16_Standard_Collections.Homework16;

import java.util.ArrayList;
import java.util.List;

public class Task2 {

   /* Задача №2

    Создать лист со значениями от 100 до 1000.*/

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();

        for (int i = 100; i <= 1000; i++) {
            numbers.add(i);
        }
        System.out.println(numbers);
    }
}
