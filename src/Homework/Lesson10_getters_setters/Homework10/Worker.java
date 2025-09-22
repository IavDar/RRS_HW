package Homework.Lesson10_getters_setters.Homework10;

public class Worker {

    private double baseSalary;

    public Worker(double baseSalary){
        this.baseSalary = baseSalary;
    }

    public double getSalary(){
        return baseSalary;
    }
}
