package com.ua.robot.homework18;

import java.util.Arrays;

public class MyArrayList<T> implements MyList<T> {

    private final int DEFAULT_CAPACITY = 3;
    private final int CUT_RATE = 2;
    private Object[] array = new Object[DEFAULT_CAPACITY];
    private int count = 0;


    public MyArrayList() {
    }

    @Override
    public void add(T item) {
        if (count == 0) {
            array[0] = item;
            count++;
        } else {
            if (count == array.length - 1) {
                grow(array.length * 2);
            }
            array[count++] = item;
        }
    }

    private void grow(int newLength) {
        Object[] newArray = new Object[newLength];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        array = newArray;
    }

    @Override
    public T get(int index) {
        return (T) array[index];
    }

    @Override
    public void remove(int index) {
        for (int i = index; i < count; i++) {
            array[i] = array[i + 1];
        }
        array[count] = null;
        count--;
        if (array.length > DEFAULT_CAPACITY && count < array.length / CUT_RATE) {
            cut(array.length / 2);
        }
    }

    private void cut(int newLength) {
        Object[] newArray = new Object[newLength];
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null) {
                newArray[i] = array[i];
            }
        }
        array = newArray;
    }

    public int size() {
        return count;
    }

    @Override
    public String toString() {
        if (count == 0) {
            return "[]";
        }
        Object[] newArray = new Object[count];
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null) {
                newArray[i] = array[i];
            }
        }
        return Arrays.toString(newArray);
    }
}
