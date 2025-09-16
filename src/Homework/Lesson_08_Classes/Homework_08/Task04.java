package Homework.Lesson_08_Classes.Homework_08;

//Задача №4
//
//Написать статический метод, превращающий натуральное (целое положительное) число (например, 643) в строку,
// состоящую из названий цифр этого числа (например, “шесть четыре три”).


public class Task04 {

    public static String numberToWords(int number){

        String result = "";
        String numStr = String.valueOf(number);

        for (int i = 0; i < numStr.length(); i++) {

            String word = "";
            String eachDigit = String.valueOf(numStr.charAt(i));

            if (numStr.equals("0")){
               word = "ноль";
            }
            else if (eachDigit.equals("1")){
                word = "один";
            }
            else if (eachDigit.equals("2")){
                word = "два";
            }
            else if (eachDigit.equals("3")){
                word = "три";
            }
            else if (eachDigit.equals("4")){
                word = "четыре";
            }
            else if (eachDigit.equals("5")){
                word = "пять";
            }
            else if (eachDigit.equals("6")){
                word = "шесть";
            }
            else if (eachDigit.equals("7")) {
                word = "семь";
            }
            else if (eachDigit.equals("8")) {
                word = "восемь";
            }
            else if (eachDigit.equals("9")) {
                word = "девять";
            }

            if (!result.isEmpty()){
                result += " ";
            }
            result += word;
        }

        return result;
    }
}
