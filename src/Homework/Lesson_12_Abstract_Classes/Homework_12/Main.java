package Homework.Lesson_12_Abstract_Classes.Homework_12;

public class Main {

//    Задача №1
//
//    Продолжение Tasks#10. Можно изменить существующий код, можно писать новый.
//
//    Поскольку каждый сотрудник имеет конкретную должность,
//    сделать класс Employee абстрактным.
//    Гарантировать, что у всех дочерних классов будет метод getSalary.
//    Считать, что зарплата (и getSalary, и getBaseSalary) начисляется каждый день.
//
//    Создать неизменяемый (immutable) класс Month с полями: имя месяца,
//    количеством дней и количеством рабочих дней. Поля должны быть спрятаны,
//    для каждого поля создать getter.
//    Создать класс MonthUtils который бы хранил подготовленные месяцы
//    или их массивы для использования (объекты класса Month).
//
//    Создать класс SalaryUtils, и в нем
//    написать метод getTotalSalary(Employee[] employees,
//    Month[] months), который подсчитает общую сумму к выплате
//    на всех сотрудников — простых работников, менеджеров и директоров.

    public static void main(String[] args) {

        Employee[] employees = new Employee[3];
        employees[0] = new Worker("Петр",100);
        employees[1] = new Manager("Антон",100, 50);
        employees[2] = new Director("Анна",100, 70);

        System.out.println(SalaryUtils.getTotalSalary(employees, MonthUtils.MONTHS));
    }
}
