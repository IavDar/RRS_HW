package Homework.Lesson_18_Exceptions_Interfaces.interfaces;

import java.util.List;

public class Main {

    List<Locator> allLocators = List.of();
}

class ManWithMap implements Locator {

    @Override
    public Coordinates whereAmI() {
        return null;
    }
}

class IPhone29 implements Locator {

    @Override
    public Coordinates whereAmI() {
        return null;
    }
}

interface Locator {

    Coordinates whereAmI();
}

class Coordinates {

}
