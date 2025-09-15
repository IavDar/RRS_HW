package Homework.Lesson_08_Classes.Homework_08;

import java.util.Objects;

public class Person {
    private String name;
    private int age;
    private String gender;

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        if (Objects.equals(gender, "male")) {
            return name = "Mr " + name;
        } else if (Objects.equals(gender, "female")) {
            return name = "Mrs " + name;
        }
        return name;
    }
}
