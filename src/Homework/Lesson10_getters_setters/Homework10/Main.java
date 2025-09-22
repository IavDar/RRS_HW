package Homework.Lesson10_getters_setters.Homework10;

public class Main {

    //    Задача №2
    //
//    Необходимо создать класс Worker где метод getSalary будет возвращать базовую ставку.
//
//    Необходимо создать класс Manager в который нужно добавить следующие методы:
//    getNumberOfSubordinates - получить количество подчиненных
//            setNumberOfSubordinates
//
//    в классе, метод getSalary будет возвращать значение по формуле - <базовая ставка> * (<количество подчиненных> / 100 * 3).
//    Если количество подчиненных 0, то результат как у обычного рабочего.
//
//    Необходимо создать класс Director с теми же методами, что и Manager,
//    но метод getSalary должен возвращать результат по формуле - <базовая ставка> * (<количество подчиненных> / 100 * 9).
//    Если количество подчиненных 0, то результат как у обычного рабочего.
//
    public static void main(String[] args) {

        double baseSalary = 1000;

        Manager manager = new Manager(baseSalary);
        manager.setNumberOfSubordinates(10);
        System.out.println("Manager:" + manager.getSalary());

        Director director = new Director(baseSalary);
        director.setNumberOfSubordinates(10);
        System.out.println("Director:" + director.getSalary());
    }
}

