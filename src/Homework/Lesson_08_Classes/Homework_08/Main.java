package Homework.Lesson_08_Classes.Homework_08;

public class Main {
    public static void main(String[] args) {

        System.out.println("Task1");
        Person firstPerson = new Person("Anna", 7, "female");
        System.out.println(firstPerson.getName());

        System.out.println("Task2");
        Employee[] employees = new Employee[4];
        employees[0] = new Employee("Alice", 12000, 2);
        employees[1] = new Employee("Bob", 8000, 1);
        employees[2] = new Employee("Charlie", 4000, 0);
        employees[3] = new Employee("Diana", 1500, 3);

        TaxPayment[] taxes = TaxPayment.getTaxAmount(employees);

        for (TaxPayment tax : taxes) {
            System.out.println(tax.getName() + " должен(на) заплатить налог: " + + tax.getTaxAmount());
        }

        System.out.println("Task3");
        System.out.println("Сумма зарплат всех сотрудников: " + Salary.getSum(employees));

        System.out.println("Task4");
        int word = 643;
        System.out.println(word + " ---> " + Task04.numberToWords(word));

    }
}
