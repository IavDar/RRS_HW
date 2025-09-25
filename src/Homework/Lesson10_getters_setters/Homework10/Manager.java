package Homework.Lesson10_getters_setters.Homework10;

public class Manager extends Employee {
    private int numberOfSubordinates;

    public Manager(double baseSalary) {
        super(baseSalary);
        this.numberOfSubordinates = 0;
    }

    public int getNumberOfSubordinates() {
        return numberOfSubordinates;
    }

    public void setNumberOfSubordinates(int numberOfSubordinates) {
        this.numberOfSubordinates = numberOfSubordinates;
    }

    @Override
    public String toString() {
        return "Manager{" + "Name= " + super.getName() +
                " numberOfSubordinates=" + numberOfSubordinates +
                '}';
    }

    @Override
    public double getSalary() {
        if (numberOfSubordinates == 0) {
            return super.getSalary();
        } else {
            return super.getSalary() * (numberOfSubordinates / 100.0 * 3);
        }
    }
}
