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

//        Manager manager = new Manager(baseSalary);
//        manager.setNumberOfSubordinates(10);
//        System.out.println("Manager:" + manager.getSalary());
//
//        Director director = new Director(baseSalary);
//        director.setNumberOfSubordinates(10);
//        System.out.println("Director:" + director.getSalary());


        // Массив сотрудников:

        Employee[] employees = new Employee[3];

        employees[0] = new Worker(baseSalary);
        employees[0].setName("Иван");

        employees[1] = new Manager(baseSalary);
        employees[1].setName("Мария");
        ((Manager) employees[1]).setNumberOfSubordinates(40);

        employees[2] = new Director(baseSalary);
        employees[2].setName("Виктор");
        ((Director) employees[2]).setNumberOfSubordinates(60);

//        System.out.println("зарплата" + employees[0].getSalary());
//        System.out.println("зарплата " + employees[1].getSalary());
//        System.out.println("зарплата " + employees[2].getSalary());


        // Массив менеждеров:

        Manager[] managers = new Manager[3];

        managers[0] = new Manager(baseSalary);
        managers[0].setName("Максим");
        managers[0].setNumberOfSubordinates(15);

        managers[1] = new Manager(baseSalary);
        managers[1].setName("Ольга");
        managers[1].setNumberOfSubordinates(35);



        // Вызовы методов:

        System.out.println("findByName: " + UtilSearch.findByName(employees, "иВан"));

        UtilSearch.findByNameSubstring(employees, "МА");

        System.out.println("SalaryBudget: " + UtilSearch.getSalaryBudget(employees));

        System.out.println("minSalary: " + UtilSearch.minSalary(employees));

        Employee employeeWithMaxSalary = UtilSearch.maxSalary(employees);

        System.out.println("MaxSalary: " + employeeWithMaxSalary.getSalary() + " Employee: " + employeeWithMaxSalary);

    }
}

