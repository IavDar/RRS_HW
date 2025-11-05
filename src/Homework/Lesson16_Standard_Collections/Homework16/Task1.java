package Homework.Lesson16_Standard_Collections.Homework16;

import java.util.ArrayList;
import java.util.List;

public class Task1 {

    /*Задача №1

    Создать лист и добавить в него следующие слова:
    White.
            Tan.
            Yellow.
            Orange.
            Red.
            Pink.
            Purple.
            Blue.
    Затем удалить из этого списка все цвета в которых встречается буква “L”*/


    public static void main(String[] args) {

        List<String> colours = new ArrayList<>();
        colours.add("White");
        colours.add("Tan");
        colours.add("Yellow");
        colours.add("Orange");
        colours.add("Red");
        colours.add("Pink");
        colours.add("Purple");
        colours.add("Blue");

        System.out.println(colours);

        colours.removeIf(word -> word.toUpperCase().contains("L"));

        System.out.println(colours);

    }
}