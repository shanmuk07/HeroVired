package pkg_09_02_23;
import java.util.*;
class SingleNode{
	int data;
	SingleNode next;
	SingleNode(int data){
		this.data = data;
		this.next = null;
	}
}

class LinkedListSingle{
	Scanner sc = new Scanner(System.in);
	SingleNode head;
	
	public void append() {
		System.out.println("Enter a value to insert: ");
		int data = sc.nextInt();
		if(head == null) {
			head = new SingleNode(data);
			return;
		}
		SingleNode temp = head;
		while(temp.next != null) {
			temp = temp.next;
		}
		temp.next = new SingleNode(data);
	}
	
	public void prepend() {
		System.out.println("Enter a value to insert: ");
		int data = sc.nextInt();
		if(head == null) {
			head = new SingleNode(data);
			return;
		}
		SingleNode temp = new SingleNode(data);
		temp.next = head;
		head = temp;
	}
	
	public void insertAfterValue() {
		System.out.println("Enter after which value you want to insert: ");
		int value = sc.nextInt();
		System.out.println("Enter a value to insert: ");
		int data = sc.nextInt();
		if(head == null) {
			head = new SingleNode(data);
			return;
		}
		SingleNode temp = head;
		SingleNode newNode = new SingleNode(data);
		while(temp.next != null) {
			if(temp.data == value) {
				newNode.next = temp.next;
				temp.next = newNode;
			}
			temp = temp.next;
		}
	}
	
	public void insertBeforeValue() {
		System.out.println("Enter value before you want to insert: ");
		int value = sc.nextInt();
		System.out.println("Enter a value to insert: ");
		int data = sc.nextInt();
		if(head == null) {
			head = new SingleNode(data);
			return;
		}
		SingleNode temp = head;
		SingleNode newNode = new SingleNode(data);
		while(temp.next != null) {
			if(temp.next.data == value) {
				newNode.next = temp.next;
				temp.next = newNode;
			}
			temp = temp.next;
		}
	}
	
	public void deleteWithValue() {
		System.out.println("Enter a value to delete: ");
		int data = sc.nextInt();
		if(head.data == data) {
			head = head.next;
		}
		SingleNode temp = head;
		while(temp.next != null){
			if(temp.next.data == data) {
				temp.next = temp.next.next;
				break;
			}
			temp = temp.next;
		}
	}
	
	public void printList() {
		SingleNode temp = head;
		while(temp != null) {
			System.out.print(temp.data + " -> ");
			temp = temp.next;
		}
	}
}


public class SingleLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedListSingle list = new LinkedListSingle();
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println();
			System.out.println("1. Insert At Beginning: ");
			System.out.println("2. Insert At Ending: ");
			System.out.println("3. Insert After Specified Value In List: ");
			System.out.println("4. Insert Before Specified Value In List: ");
			System.out.println("5. Delete A Value in List: ");
			System.out.println("6. Print List: ");
			System.out.println("Enter Your Choice: ");
			int ch = sc.nextInt();
			switch(ch) {
				case 1:
					list.prepend();
					break;
				case 2:
					list.append();
					break;
				case 3:
					list.insertAfterValue();
					break;
				case 4:
					list.insertBeforeValue();
					break;
				case 5:
					list.deleteWithValue();
					break;
				case 6:
					list.printList();
					break;
				default:
					System.out.println("Enter values from given choices only !");
					break;
			}
			
		}
	}

}
