

public class CircularLinkedList{
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);
        list.display();

        list.delete(3);
        list.display();
    }
}

class LinkedList{
    public Node head;
    public Node tail;

    public LinkedList(){
        this.head = null;
        this.tail = null;
    }

    public void insert(int value){
        Node node = new Node(value);
        if(head == null){
            head = node;
            tail = node;
            return;
        }

        tail.next = node;
        node.next = head;
        tail = node;
    }

    // ye jo value denge use delete krega
    public void delete(int value){
        Node node = head;
        if(head == null){
            return;
        }

        if(node.value == value){
            head = head.next;
            tail.next = head;
            return;
        }
        
        do{
            Node n = node.next;
            if(n.value == value){
                node.next = n.next;
                break;
            }
            node = node.next;
        }while(node != head);
    }

    public void display(){
        Node node = head;
        if(head != null){
            do{
                System.out.print(node.value + " -> ");
                node = node.next;
            }while(node != head);
        }
        System.out.println("HEAD");
    }

    private class Node{
        private int value;
        private Node next;

        private Node(int value){
            this.value = value;
        }
    }
}