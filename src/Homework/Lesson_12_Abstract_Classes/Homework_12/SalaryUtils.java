package Homework.Lesson_12_Abstract_Classes.Homework_12;

//Создать класс SalaryUtils, и в нем написать метод getTotalSalary(Employee[] employees,
//   Month[] months), который подсчитает общую сумму к выплате
// на всех сотрудников — простых работников, менеджеров и директоров.

public class SalaryUtils {

    public static double getTotalSalary(Employee[] employees, Month[] months) {
        double totalSalary = 0;

        for (int i = 0; i < employees.length; i++) {

            for (int j = 0; j < months.length; j++) {

                double oneEmployeeSalary = employees[i].getSalary() * months[j].getWorkingDaysAmount();

                totalSalary += oneEmployeeSalary;
            }

        }

        return totalSalary;
    }
}
