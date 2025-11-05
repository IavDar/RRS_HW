package Homework.Lesson16_Standard_Collections.Homework16;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ExtraTask {

    /*    Экстра задача

        Попробуйте изменить тип итерационной переменной из цикла в третьей задаче,
    на Integer (не int, а Integer) и добиться такого же результата как и с типом int.
    */
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();

        for (int i = 100; i <= 1000; i++) {
            numbers.add(i);
        }

        System.out.println(numbers);

        for (Integer i = numbers.size() - 1; i >= 0; i--) {
            if (numbers.get(i) % 2 == 0) {
                numbers.remove(numbers.get(i));
            }
        }

        System.out.println(numbers);

    }
}
