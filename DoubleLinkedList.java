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
		}
		Node temp = head;
		while(temp.next != null) {
			temp = temp.next;
		}
		temp.next = newNode;
		newNode.prev = temp;
	}
	public void printList() {
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.data + " -> ");
			temp = temp.next;
		}
		System.out.print("null");
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

	}

}
