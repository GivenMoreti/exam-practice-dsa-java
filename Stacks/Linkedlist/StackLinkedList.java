package Stacks.Linkedlist;

import LinkedLists.MyLinkedList;

public class StackLinkedList<T> {

    MyLinkedList<T> stack;

    public StackLinkedList() {
        stack = new MyLinkedList<>();
    }

    // pop - remove from top of stack
    public T pop() {
        T element = stack.getLast();
        if (!stack.isEmpty()) {
            stack.delete(element);
        }
        return null;
    }

    // push
    public void push(T element) {
        stack.append(element);
    }
}
