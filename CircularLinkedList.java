class Node{
    int data;
    Node next;
    public Node(int data){
        this.data = data;
        this.next = null;
    }
}

class LinkedList{
    Node head;
    Node tail;
    public LinkedList(){
        this.head = null;
        this.tail = null;
    }
    void insertElement(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            tail = newNode;
        }else{
            tail.next = newNode;
            tail = newNode;
        }
        tail.next = head;
    }

    void addToStart(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            tail = newNode;
        }else{
            newNode.next = head;
            tail.next = newNode;
            head = newNode;
        }
    }

    void printList(){
        Node temp = head;
        do{
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }while(temp != head);
        System.out.println();
    }
}
public class CircularLinkedList {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        int arr[] = {1, 2, 3, 4, 5};
        for(int i = 0; i < arr.length; i++){
            list.insertElement(arr[i]);
        }
        list.addToStart(0);
        list.printList();
    }
}
