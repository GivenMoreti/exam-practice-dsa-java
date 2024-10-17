package Queues.Linkedlist;

import LinkedLists.MyLinkedList;

public class QueueLinkedList<T> {

    MyLinkedList<T> queue;

    // constructor.
    public QueueLinkedList() {
        queue = new MyLinkedList<>();
    }

    // enqueue
    public void enqueue(T element) {
        queue.append(element);
    }

    // dequeue

    public T dequeue() {
        T temp = queue.getFirst();
        if (!queue.isEmpty()) {
            queue.delete(temp);
            return temp;
        }
        return null;
    }

}
