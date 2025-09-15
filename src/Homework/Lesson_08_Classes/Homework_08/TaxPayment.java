package Homework.Lesson_08_Classes.Homework_08;

//Задача №2
//
//Создать класс Employee , в котором хранится информация о сотруднике предприятия: имя, месячная зарплата, количество детей.
//Создать класс TaxPayment, в котором будет храниться имя сотрудника, и сумма подоходного налога, который он должен будет заплатить.
//Создать статический метод метод, который получит массив сотрудников, и вернет (или распечатает, но лучше, если вернет) массив налоговых выплат (TaxPayment) по следующему правилу:
//Если зарплата больше 10000, то налоговая ставка 23%
//Если зарплата от 5000 до 10000, то налог составляет 18%
//Если зарплата меньше 5000, то налог составляет 13%
//За каждого ребенка из зарплаты вычитается 1000, и налог берется с оставшейся суммы.


public class TaxPayment {
    private String name;
    private double taxAmount;

    public TaxPayment(String name, double taxAmount) {
        this.name = name;
        this.taxAmount = taxAmount;
    }

    public String getName() {
        return name;
    }

    public double getTaxAmount() { // сумма подоходного налога ( он же налоговая выплата)
        return taxAmount;
    }

    public static TaxPayment[] getTaxAmount(Employee[] employees) {

        TaxPayment[] taxPayments = new TaxPayment[employees.length];


        for (int i = 0; i < employees.length; i++) {
            Employee emp = employees[i];

            double taxableSalary = Math.max(0, emp.getMonthSalary() - emp.getChildrenAmount() * 1000); // За каждого ребенка из зарплаты вычитается 1000

            double taxRate;

            if (taxableSalary > 10000) {
                taxRate = 0.23;

            } else if (taxableSalary >= 5000) {
                taxRate = 0.18;
            } else {
                taxRate = 0.13;
            }

            double tax = taxableSalary * taxRate;
            taxPayments[i] = new TaxPayment(emp.getName(), tax);
        }

        return taxPayments;
    }
}
