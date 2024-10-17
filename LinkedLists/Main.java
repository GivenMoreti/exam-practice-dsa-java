package LinkedLists;

public class Main {
    public static void main(String[] args) {
        MyLinkedList<Integer> list = new MyLinkedList<>();

        list.append(3);
        list.append(93);
        System.out.println(list);

        list.prepend(0);
        System.out.println(list);

        list.insert(2, 10);
        System.out.println(list);

        list.insert(2, 10);
        System.out.println(list);
        System.out.println("Size:" + list.getSize());

        System.out.println("Uniques: " + list.getUniques());

        MyLinkedList<Integer> list2 = new MyLinkedList<>();
        list2.append(3);
        list2.append(7);
        list2.append(2);

        MyLinkedList<Integer> list3 = new MyLinkedList<>();
        list2.append(1);
        list2.append(16);

        System.out.println("Merged: " + list.merge(list2, list3));

    }
}
