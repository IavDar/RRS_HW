package Homework.Lesson_12_Abstract_Classes.Homework_12;

public class Manager extends Employee {
    private int numberOfSubordinates;

    public Manager(String name,double baseSalary, int numberOfSubordinates) {
        super(name, baseSalary);
        this.numberOfSubordinates = numberOfSubordinates;
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
