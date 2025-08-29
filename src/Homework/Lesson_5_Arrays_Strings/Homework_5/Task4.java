package Homework.Lesson_5_Arrays_Strings.Homework_5;

public class Task4 {

//    Задача №4
//го
//    Дана строка:
//    String s = “Перестановочный алгоритм быстрого действия”;
//    необходимо вывести все буквы “о” из этой строки.
//    Для указанной строки ответ будет “ооооо” (или в столбик)

    public static void main(String[] args) {
        String s = "Перестановочный алгоритм быстрого действия";
        for (int i = 0; i < s.length(); i++) {
                    if (s.charAt(i)=='о' || s.charAt(i)=='О') {
                        System.out.print(s.charAt(i));
                    }
        }
    }
}
