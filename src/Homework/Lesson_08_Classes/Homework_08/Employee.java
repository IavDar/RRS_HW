package Homework.Lesson_08_Classes.Homework_08;

import java.math.BigDecimal;

public class Employee {
    private String name;
    private double monthSalary;
    private int childrenAmount;

    public Employee(String name, double salary, int childrenAmount) {
        this.name = name;
        this.monthSalary = salary;
        this.childrenAmount = childrenAmount;
    }

    public String getName() {
        return name;
    }

    public double getMonthSalary() {
        return monthSalary;
    }

    public int getChildrenAmount() {
        return childrenAmount;
    }
}
