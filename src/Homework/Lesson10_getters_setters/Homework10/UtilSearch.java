package Homework.Lesson10_getters_setters.Homework10;

public class UtilSearch {


//    Задача №3
//
//    Необходимо создать утилитарный класс со следующими методами:
//    поиск сотрудника в массиве по его имени
//    поиск сотрудника в массиве по вхождению указанной строки в его имени
//    подсчет зарплатного бюджета для всех сотрудников в массиве
//    поиск наименьшей зарплаты в массиве
//    поиск наибольшей зарплаты в массиве
//    поиск наименьшего количества подчиненных в массиве менеджеров
//    поиск наибольшего количества подчиненных в массиве менеджеров
//    поиск наибольшей надбавки (разнице между базовой ставкой и зарплатой) в массиве менеджеров
//    поиск наименьшей надбавки (разнице между базовой ставкой и зарплатой) в массиве менеджеров


    public static Employee findByName(Employee[] employees, String employeeName) {

        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getName().equalsIgnoreCase(employeeName)) {

                return employees[i];
            }
        }
        return null;
    }

    public static void findByNameSubstring(Employee[] employees, String subStringName) { // лучше с возвр знач сделать, не void

        boolean foundEmployee = false;

        for (int i = 0; i < employees.length; i++) {

            if ((employees[i] != null) && (employees[i].getName().toLowerCase().contains(subStringName.toLowerCase()))) {
                System.out.println("findByNameSubstring: " + employees[i]);
                foundEmployee = true;
            }

        }
        if (!foundEmployee) {
            System.out.println("Сотрудник не найден");
        }
    }

    public static double getSalaryBudget(Employee[] employees) {
        double salaryBudget = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                salaryBudget += employees[i].getSalary();
            }
        }

        return salaryBudget;
    }

    public static double minSalary(Employee[] employees) {
        double minSalary = Double.MAX_VALUE;
        for (int i = 0; i < employees.length; i++) {

            if ((employees[i] != null) && (employees[i].getSalary() < minSalary)) {
                minSalary = employees[i].getSalary();

            }
        }
        return minSalary;
    }

    public static Employee maxSalary(Employee[] employees) {
        Employee maxSalaryEmployee = null;
        double maxSalary = 0;
        for (int i = 0; i < employees.length; i++) {

            if ((employees[i] != null) && (employees[i].getSalary() > maxSalary)) {
                maxSalary = employees[i].getSalary();
                maxSalaryEmployee =employees[i];

            }
        }
        return maxSalaryEmployee;
    }
}
