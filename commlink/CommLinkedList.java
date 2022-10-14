package commlink;

public class CommLinkedList {
    Node head;
    Node tail;
    int size;
    CommLinkedList(){
        this.size=0;
    }
    public void insertFirst(Communication com){
         Node node = new Node(com);
           node.next = head;
           head= node;

           if(tail == null){
               tail= head;
           }
           size++;
    }

    public void insertLast(Communication com){
        if(tail == null){
            insertFirst(com);
        }
        Node node = new Node(com);
        tail.next = node;
        tail = node;
        size++;
    }

    public int getSize(){
        return size;
    }
    public void display(){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.com + "->");
            temp= temp.next;
        }
    }
    private class Node{
        Communication com;
        Node next;
        Node(Communication com){
            this.com = com;
        }
        Node(Communication com, Node next){
            this.com = com;
            this.next= next;
        }
    }
}
