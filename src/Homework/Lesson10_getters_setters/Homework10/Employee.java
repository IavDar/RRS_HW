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

    public Employee(double baseSalary){
        this.baseSalary = baseSalary;
    }

    public String getName() {
        return name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' + "Base Salary= " + baseSalary +
                '}';
    }

    public double getSalary(){
        return baseSalary;
    }
}
