package com.ua.robot.homework18;

public interface MyList<T> {

    void add(T item);

    T get(int index);

    void remove(int index);

    int size();
}
