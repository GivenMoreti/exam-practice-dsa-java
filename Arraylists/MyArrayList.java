package Arraylists;

import java.util.Arrays;

public class MyArrayList<T> {
    private int size;
    private T[] data;
    private int DEFAULT_SIZE = 5;

    // constructor
    @SuppressWarnings("unchecked")
    public MyArrayList() {
        data = (T[]) new Object[DEFAULT_SIZE];
        size = 0;
    }

    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        return data[index];
    }

    public MyArrayList<T> merge(MyArrayList<T> list1, MyArrayList<T> list2) {
        MyArrayList<T> merged = new MyArrayList<>();

        for (int i = 0; i < list1.getSize(); i++) {
            merged.append(list1.get(i));
        }

        for (int i = 0; i < list2.getSize(); i++) {
            merged.append(list2.get(i));
        }

        return merged;
    }

    // methods
    public boolean isEmpty() {
        return size == 0;
    }

    // remove the element passed
    public T remove(T element) {
        for (int i = 0; i < data.length; i++) {
            if (data[i] == element) {
                T removedElement = data[i];

                for (int j = i; j < size - 1; j++) {
                    data[j] = data[j + 1];
                }

                data[size - 1] = null;
                size--;
                return removedElement;
            }
        }
        return null;
    }

    // remove element at index x
    public T remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("out of bounds");
        }

        T element = data[index];
        // if middle or start shift elements to the left accordingly
        for (int i = index; i < size - 1; i++) {
            data[i] = data[i + 1];
        }
        data[size - 1] = null;
        size--;
        return element;

    }

    public String toString() {
        return Arrays.toString(Arrays.copyOf(data, size));
    }

    public void insert(int index, T element) {

        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index out of bounds ");
        }
        if (isFull()) {
            resize();
        }

        if (index == 0) {
            prepend(element);
            return;
        }

        if (index == size) {
            append(element);
            return;
        }

        // shift elements to the right
        for (int i = size - 1; i >= index; i--) {
            data[i + 1] = data[i];
        }
        data[index] = element;
        size++;

    }

    // prepend
    public void prepend(T element) {
        if (isFull()) {
            resize();
        }
        for (int i = size - 1; i >= 0; i--) {
            data[i + 1] = data[i];
        }

        data[0] = element;
        size++;
    }

    // append
    public void append(T element) {
        if (isFull()) {
            resize();
        }
        data[size] = element;
        size++;
    }

    public int getSize() {
        return size;
    }

    private boolean isFull() {
        return size == data.length;
    }

    private void resize() {
        @SuppressWarnings("unchecked")
        T[] temp = (T[]) new Object[data.length * 2];
        // copy elements into the new array
        for (int i = 0; i < size; i++) {
            temp[i] = data[i];

        }
        data = temp;
    }
}