

public class DoublyLinkedList{
    public static void main(String[] args){
        LinkedList list = new LinkedList();

        list.insertLast(1);
        list.insertLast(2);
        list.insertLast(3);
        list.insertLast(4);
        list.insertLast(5);
        list.display();
        list.displayReverse();

        list.insertFirst(0);
        list.display();
        list.displayReverse();

        list.insert(100, 2);   // insert by index(ye 2 index pr 100 insert krega)
        list.display();
        list.displayReverse();

        list.insert1(2, 50);   // insert by value(ye 2 ke baad 50 insert krega)
        list.display();
        list.displayReverse();

        System.out.println(list.deleteFirst());
        list.display();
        list.displayReverse();

        System.out.println(list.deleteLast());
        list.display();
        list.displayReverse();

        System.out.println(list.delete(2));   // delete by index(ye 2 index pe jo node h use delete krega)
        list.display();
        list.displayReverse();

        list.delete1(50);    //delete by value(ye 50 value wale index ko delete krega)
        list.display();
        list.displayReverse();

    }
}

class LinkedList{
    private Node head;
    private Node tail;
    public int size;

    public LinkedList(){
        this.size = 0;
    }

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if(head != null){
            head.prev = node;
        }

        if(tail == null){
            tail = node;
        }

        head = node;
        size +=1;
    }

    public void insertLast(int val){
        if(tail == null){
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        node.next = null;
        tail.next = node;
        node.prev = tail;
        tail = node;
        size++;
    }

    // ye jo index denge us index pr new node insert krega (index 3 pr 50)
    public void insert(int val, int index){
        if(index == 0){
            insertFirst(val);
            return;
        }

        if(index == size){
            insertLast(val);
            return;
        }

        if(index > size){
            System.out.println("Index out of bound");
        }

        Node temp = head;
        for(int i = 1; i < index; i++){
            temp = temp.next;
        }

        Node node = new Node(val);
        node.next = temp.next;
        node.prev = temp;
        temp.next.prev = node;
        temp.next = node;

        size++;
    }

    // ye jo value denge uske baad new node ko insert krega (value 2 ke baad 100)
    public void insert1(int after, int value){
        Node prev = find(after);

        if(prev == null){
            System.out.println("Does not exist");
            return;
        }

        Node node = new Node(value);
        node.next = prev.next;
        node.prev = prev;
        prev.next = node;
        if(node.next != null){
            node.next.prev = node;
        }
        else{
            tail = node;
        }

        size++;
    }

    public int deleteFirst(){
        if(head == null){
            return -1;
        }

        int val = head.value;

        if(head == tail){         
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
        
        size--;
        return val;
    }

    public int deleteLast(){
        if(size <= 1){
            return deleteFirst();
        }

        int val = tail.value;
        tail = tail.prev;
        tail.next = null;

        size--;
        return val;
    }

    // delete by index
    public int delete(int index){
        if(index == 0){
            return deleteFirst();
        }

        if(index == size - 1){
            return deleteLast();
        }

        Node node = get(index);
        int val = node.value;

        node.prev.next = node.next;
        node.next.prev = node.prev;
       
        size--;
        return val;
    }

    // delete by value
    public void delete1(int value){
        Node node = find(value);
        if(node == null){
            return;
        }
        if(node == head){
            deleteFirst();
            return;
        }

        if(node == tail){
            deleteLast();
            return;
        }

        node.prev.next = node.next;
        node.next.prev = node.prev;

        size--;
    }

    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public void displayReverse(){
        Node temp = tail;
        while(temp != null){
            System.out.print(temp.value + " -> ");
            temp = temp.prev;
        }
        System.out.println("START");
    }

    // ye jo valu denge vo node return krega
    public Node find(int value){
        Node node = head;
        while(node != null){
            if(node.value == value){
                return node;
            }
            node = node.next;
        }
        return null;
    }

    // ye jo index denge vo node return krega
    public Node get(int index){
        Node node = head;
        for(int i = 0; i < index; i++){
            node = node.next;
        }
        return node;
    }


    private class Node{
        private int value;
        private Node next;
        private Node prev;

        public Node(int value){
            this.value = value;
        }

        public Node(int value, Node next, Node prev){
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }
}