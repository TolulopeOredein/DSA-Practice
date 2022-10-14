package LinkedList;

public class LinkedListDriver {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertFirst(10);
        list.insertFirst(50);
        list.insertFirst(23);
        list.insertFirst(19);
        list.insertFirst(40);
        list.insertLast (90);
        list.display();
        int size = list.getSize();
        System.out.println("The size of the Link is :" + size);
    }
}
