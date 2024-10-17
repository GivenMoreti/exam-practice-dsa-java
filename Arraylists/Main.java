package Arraylists;

public class Main {

    public static void main(String[] args) {
        MyArrayList<Integer> list = new MyArrayList<>();
        list.append(1);
        System.out.println(list);
        System.out.println("Size: " + list.getSize());

        list.append(2);
        System.out.println(list);
        System.out.println("Size: " + list.getSize());

        list.append(3);
        System.out.println(list);
        System.out.println("Size: " + list.getSize());

        list.prepend(4);
        System.out.println(list);
        System.out.println("Size: " + list.getSize());

        list.insert(2, 5);
        System.out.println(list);
        System.out.println("Size: " + list.getSize());

        list.insert(5, 6);
        System.out.println(list);
        System.out.println("Size: " + list.getSize());

        list.remove(2);
        System.out.println(list);
        System.out.println("Size: " + list.getSize());

        Integer element = list.remove(new Integer(1));
        System.out.println("Removing element: " + element);
        System.out.println(list);
        System.out.println("Size: " + list.getSize());
        //
        MyArrayList<Member> members = new MyArrayList<>();
        Member m1 = new Member("Kane", 3);
        Member m2 = new Member("Kim", 10);
        members.append(m2);
        members.append(m1);

        System.out.println(members);
        System.out.println(m1.compareTo(m2));

        MyArrayList<Integer> list2 = new MyArrayList<>();

        list2.append(3);
        list2.append(4);
        list2.append(5);
        MyArrayList<Integer> list3 = new MyArrayList<>();
        list3.append(4);
        list3.append(2);
        list3.append(1);
        list3.append(7);

        System.out.println("Merged List: " + list.merge(list2, list3));

    }
}
