package Homework.Lesson_22_Generics;

import java.util.List;

public interface Repository<Entity> {

    Entity findById(int id);
    void save(Entity e);
    List<Entity> findAll();
}
