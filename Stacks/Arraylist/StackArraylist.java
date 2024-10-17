package Stacks.Arraylist;

import Arraylists.MyArrayList;

public class StackArraylist<T> {
    MyArrayList<T> stack;

    public StackArraylist() {
        stack = new MyArrayList<T>();
    }

    // custom methods
    public void push(T element) {
        stack.append(element);
    }

    public T pop() {
        T element = null;
        if (stack.getSize() > 0) {
            element = stack.remove(stack.getSize());
        }
        return element;
    }

}
