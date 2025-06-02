package Homework.Lesson_22_Generics;

import java.util.ArrayList;
import java.util.List;

public class L22Generics {
    public static void main(String[] args) {
        List<String> strings = List.of(
                "В", "лесу", "родилась", "елочка"
        );

        System.out.println(StringLengths(strings));

        List<Integer> sizes1 = StringLengths(strings);

        System.out.println(even(sizes1));

    }

    public static List<Integer> StringLengths(List<String> stringsParam) {
        List<Integer> result = new ArrayList<>();
//        result.add(4); можно добавить, т.к. тип такой же, как указан в дженериках.
//        result.add("String"); компилятор не дает добавить String, т.к. в дженерике указан тип <Integer>
        for (String element : stringsParam) {
            result.add(element.length());
        }
        return result;
    }

    public static List<Boolean> even(List<Integer> numbers) {
        List<Boolean> result = new ArrayList<>();
        for (Integer element : numbers) {
                result.add((element % 2) ==0);
        }
        return result;
    }
}
