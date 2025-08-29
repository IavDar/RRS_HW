package Homework.Lesson_5_Arrays_Strings.Homework_5;

public class Task5 {

//    Задача №5
//
//    Дана строка:
//    String s = “Перевыборы выбранного президента”;
//    необходимо подсчитать количество букв “е” в строке.
//    Для указанной строки ответ будет 4.

    public static void main(String[] args) {

        String s = "Перевыборы выбранного президента";
        int res = 0;
        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == 'е') {
                res++;
            }
        }
        System.out.println(res);
    }
}
