package Homework.Lesson10_getters_setters.Homework10;

public class Director extends Worker {
    private int numberOfSubordinates;

    public Director (double baseSalary) {
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
    public double getSalary() {
        if (numberOfSubordinates == 0) {
            return super.getSalary();
        } else {
            return super.getSalary() * (numberOfSubordinates / 100.0 * 9); // почему когда один подчиненный зарплата получается выше, чем когда нет подчиненных?
        }
    }
}
