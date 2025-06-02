package Homework.Lesson_6_Looping_through_Arrays.General_Lesson_6;

import java.util.Arrays;
import java.util.Locale;

public class Lesson6 {
    public static void main(String[] args) {

        // Методы строки:

        // Методы строки не меняют исходную строку!
        // String это неизменяемый (immutable) класс.

        String str = "Hello, world!";
        System.out.println(str.substring(7)); // нумерация индексов идет с нуля
        System.out.println(str.substring(0, 5)); // пять символов с начала. Нач индекс включительно, конечный исключ.
        System.out.println(str.substring(str.length() - 3)); // отсчет с конца

        // в основе строки лежит массив chars
        System.out.println(str.charAt(5)); // какой символ стоит под соотв. индексом

        // для сравнения объектов используется метод equals:
        System.out.println(str.equals("Hello, world!"));
        System.out.println(str.equalsIgnoreCase("HELLO, world!"));

        // через == сравниваются только ссылки на объекты.
        // Поэтому его используют только для примитивных типов.

        System.out.println(str.compareTo("Hello, world!")); // можно использовать вместо equals
        // если результат 0, то строки равны.
        // в таблице аски вначале идут все большие буквы, а потом все маленькие


        System.out.println(str.toUpperCase()); // привести к верхнему регистру, оригинальная строка не меняется
        System.out.println(str.toLowerCase());

        System.out.println(str.contains("worl")); // проверка подстроки
        System.out.println(str.startsWith("He")); // проверка, с каких символов начинается строка
        System.out.println(str.endsWith("!"));


        int indexOf = str.indexOf('o');
        if (indexOf < 0) {
            System.out.println("Указанного символа нет в строке");
        } else {
             System.out.println(str.substring(indexOf));
        }

        int lastIndOf = str.lastIndexOf('o');
        if (lastIndOf < 0) {
            System.out.println("Указанного символа нет в строке");
        } else {
            System.out.println(str.substring(lastIndOf));
        }


//       Метод split() в Java используется для разделения
//       строки на массив подстрок по заданному разделителю (регулярному выражению):

        String str2 = "в лесу родилась елочка";
        String [] words = str2.split(" "); // здесь разделяем строку по пробелам
        // сам разделитель не входит в новый массив
        System.out.println(Arrays.toString(words));
        System.out.println(words.length);

        // regex - регулярные выражения (если мы хотим по каким-то хитрым правилам разделить строку)
        System.out.println(str2.replaceAll("о", "О"));


        System.out.println(str);
        System.out.println(str2);


//      Массивы:

        String[] months = {"январь", "феврвль", "март", "апрель", "май",
                "июнь", "июль", "август", "сентябрь", "октябрь", "ноябрь", "декабрь"
        };


        String[] result = new String[months.length];
        for (int i = 0; i < months.length; i++) {
            result[i] = months[i].toUpperCase();
        }

        System.out.println(Arrays.toString(result));
        System.out.println(Arrays.toString(months)); // изначальный массив не изменился

        int[] result2 = new int[months.length];
        for (int i = 0; i < months.length; i++) {
            result2[i] = months[i].length();
        }
        System.out.println(Arrays.toString(result2));



        for (int i = 0; i < months.length; i++) {
            if (months[i].endsWith("ь")) {
                System.out.print(months[i] + " ");
            }
        }
    }
}
