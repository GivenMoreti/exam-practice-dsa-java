package LinkedLists;

public class MyLinkedList<T> {

    Node<T> head, tail;

    public MyLinkedList() {
        this.head = tail = null;
    }

    public T getFirst() {
        return head.element;
    }

    public T getLast() {
        return tail.element;
    }

    public int getSize() {
        int count = 0;
        Node<T> temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    // isEmpty

    public boolean isEmpty() {
        return getSize() == 0;
    }

    // delete
    public boolean delete(T element) {
        Node<T> temp = head;
        Node<T> prev = null;

        while (temp != null && ((Comparable) temp.element).compareTo(element) != 0) {

            prev = temp;
            temp = temp.next;

        }
        if (temp == null) {
            return false;
        }
        if (temp == head) {
            head = head.next;
        }
        if (temp == tail) {
            tail = prev;
        } else {
            prev.next = temp.next;
        }
        return true;

    }

    // merge lists
    @SuppressWarnings({ "rawtypes", "unchecked" })
    public MyLinkedList<T> merge(MyLinkedList<T> list1, MyLinkedList<T> list2) {
        MyLinkedList<T> merged = new MyLinkedList<>();

        Node<T> temp1 = list1.head;
        Node<T> temp2 = list2.head;

        while (temp1 != null && temp2 != null) {
            if (((Comparable) temp1.element).compareTo(temp2.element) < 0) {
                merged.append(temp1.element);
                temp1 = temp1.next;
            } else {
                merged.append(temp2.element);
                temp2 = temp2.next;
            }
        }

        while (temp1 != null) {
            merged.append(temp1.element);
            temp1 = temp1.next;
        }

        while (temp2 != null) {
            merged.append(temp2.element);
            temp2 = temp2.next;
        }

        return merged;
    }

    // uniques - returns a list with unique values i.e. without duplicates
    public MyLinkedList<T> getUniques() {
        MyLinkedList<T> rList = new MyLinkedList<>();
        Node<T> temp = head;
        // Node<T> temp2= this.head;

        while (temp != null) {
            boolean isUnique = true;
            Node<T> temp2 = head;

            while (temp2 != temp) {
                if (((Comparable) temp.element).compareTo(temp2.element) == 0) {
                    isUnique = false;
                    break;
                }
                temp2 = temp2.next;
            }
            if (isUnique) {
                rList.append(temp.element);
            }
            temp = temp.next;
        }
        return rList;

    }

    // delete
    // isPalindrome
    //
    // public boolean delete(T element) {
    // Node<T> temp = head;

    // }

    public void prepend(T element) {
        Node<T> node = new Node<T>(element);

        if (head == null) {
            head = tail = node;
        }
        node.next = head;
        head = node;

    }

    public void append(T element) {
        Node<T> node = new Node<T>(element);
        if (head == null) {
            head = tail = node;
        }
        tail.next = node;
        tail = node;
    }

    public void insert(int index, T element) {
        if (index < 0 || (index > 0 && head == null)) {
            throw new IndexOutOfBoundsException("Invalid index");
        }
        if (index == 0) {
            prepend(element); // Insert at the head
            return;
        }
        Node<T> node = new Node<T>(element);
        Node<T> prev = head;

        int count = 1;
        while (count < index - 1) {
            prev = prev.next;
            count++;
        }

        node.next = prev.next;
        prev.next = node;

    }

    public String toString() {
        String res = "[";
        Node<T> temp = head;

        while (temp != null) {
            res += temp.element;
            if (temp.next != null) {
                res += ",";
            }

            temp = temp.next;
        }

        res += "]";
        return res;
    }

    private class Node<T> {
        T element;
        Node next;

        public Node(T element) {
            this.element = element;
            this.next = null;
        }
    }
}
