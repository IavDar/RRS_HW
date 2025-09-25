package Homework.Lesson10_getters_setters.Homework10;

public class Worker extends Employee {

    public Worker(double baseSalary){
        super(baseSalary);
    }

    @Override
    public String toString() {
        return "Worker{" +  super.toString() +
                "}";
    }

    @Override
    public double getSalary(){
        return getBaseSalary();
    }
}
