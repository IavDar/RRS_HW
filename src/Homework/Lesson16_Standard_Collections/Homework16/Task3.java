package Homework.Lesson16_Standard_Collections.Homework16;

import java.util.ArrayList;
import java.util.List;

public class Task3 {

    /*Задача №3

    Удалить из листа, созданного в предыдущей задаче, все четные элементы.*/

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();

        for (int i = 100; i <= 1000; i++) {
            numbers.add(i);
        }

        System.out.println(numbers);

        for (int i = 0 ; i <= numbers.size() - 1; i++) {
            if (numbers.get(i) % 2 == 0) {
               numbers.remove(i);
           }
       }

        System.out.println(numbers);
    }
}
