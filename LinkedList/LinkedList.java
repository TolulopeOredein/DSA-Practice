package LinkedList;

public class LinkedList {
    private Node head;
    private Node tail;
    private int size;

    LinkedList(){
        this.size=0;
    }

    //Display takes O(N)
    public void display(){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.value + "->");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public void insertLast(int val){
        if(tail == null){
            insertFirst(val);
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }
    public  void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;

        if(tail == null){
            tail = head;
        }
        size +=1;
    }

    public int getSize(){
        return this.size;
    }

    private class Node {
        private int value;
        private Node next;

        Node(int value){
            this.value=value;
        }

        Node(int value, Node next){
            this.value= value;
            this.next= next;
        }
    }
}
