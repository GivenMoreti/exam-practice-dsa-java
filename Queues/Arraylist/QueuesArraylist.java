/*QUEUES ARE FIFO DS */

package Queues.Arraylist;

import Arraylists.MyArrayList;

public class QueuesArraylist<T> {
    MyArrayList<T> queue;

    // constructor
    public QueuesArraylist() {
        queue = new MyArrayList<T>();
    }

    // custom methods
    public T dequeue() {
        T element = null;
        if (queue.getSize() > 0) {
            element = queue.remove(0);
        }

        return element;
    }

    public void enqueue(T element) {
        queue.insert(queue.getSize(), element);

    }

}
