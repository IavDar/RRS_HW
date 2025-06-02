package Homework.Lesson_18_Exceptions_Interfaces.Lesson_18;

import java.util.Random;

public class Grade {
    private final int numGrade;
    static Random random = new Random();

    public Grade(int numGrade) {
        this.numGrade = numGrade;
    }
}
