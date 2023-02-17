package pkg_09_02_23;

class Node{
	Node prev;
	int data;
	Node next;
	Node(int data){
		this.prev = null;
		this.data = data;
		this.next = null;
	}
}

class LinkedList{
	Node head;
	public void append(int data) {
		Node newNode  = new Node(data);
		if(head == null) {
			head = newNode;
			return;
		}
		Node temp = head;
		while(temp.next != null) {
			temp = temp.next;
		}
		newNode.prev = temp;
		temp.next = newNode;
		
	}
	
	public void prepend(int data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
			return;
		}
		head.prev = newNode;
		newNode.next = head;
		head = newNode;
	}
	
	public void insertAfterElement(int data, int ele) {
		Node newNode = new Node(data);
		Node temp = head;
		while(temp.data != ele) {
			temp = temp.next;
		}
		newNode.prev = temp;
		newNode.next = temp.next;
		temp.next.prev=newNode;
		temp.next = newNode;
	}
	
	public void insertBeforeElement(int data, int ele) {
		Node newNode = new Node(data);
		Node temp = head;
		while(temp.data != ele) {
			temp = temp.next;
		}
		newNode.prev = temp.prev;
		newNode.next = temp;
		temp.prev.next = newNode;
		temp.prev = newNode;
	}
	
	public void deleteHead() {
		if(head == null) {
			System.out.println("Nothing to delete: ");
			return;
		}
		head = head.next;
		head.prev = null;
	}
	
	public void deleteAtEnd() {
		Node temp = head;
		while(temp.next != null) {
			temp = temp.next;
		}
		temp.prev.next = null;
	}
	
	public void deleteAfter(int ele) {
		Node temp = head;
		while(temp.data != ele) {
			temp = temp.next;
		}
		temp.next = temp.next.next;
		temp.next.prev = temp;
		
	}
	
	public void printList() {
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.data + " -> ");
			temp = temp.next;
		}
		System.out.print("null\n");
	}
}

public class DoubleLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList list = new LinkedList();
		list.append(1);
		list.append(2);
		list.append(3);
		list.printList();
		
		list.prepend(0);
		list.printList();
		
		list.insertAfterElement(-2, 2);
		list.printList();
		
		list.insertBeforeElement(-2, 2);
		list.printList();
		
		list.deleteHead();
		list.printList();
		
		list.deleteAtEnd();
		list.printList();
		
		list.deleteAfter(-2);
		list.printList();
		
		
	}

}
