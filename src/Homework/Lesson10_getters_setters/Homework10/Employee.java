package Homework.Lesson10_getters_setters.Homework10;

//Задача №1
//
//Необходимо создать класс Employee со следующими методами:
//getBaseSalary - получить базовую ставку
//        setBaseSalary
//getName - получить имя
//setName
//getSalary - получить зарплату



public class Employee {
    private String name;
    private double baseSalary;
    private double salary;

    public String getName() {
        return name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public double getSalary(){
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }
}
