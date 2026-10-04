package queueDemo;

public class QueueUsingLinkedList {
	Node front;
	Node rare;
	class Node{
		int data;
		Node next;
		
		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	public void enqueue(int data) {
		Node newNode = new Node(data);
		if(front == null) {
			front = newNode;
			return;
		}
		rare.next = newNode;
		rare = newNode;
	}
	
	public void dequeue() {
		if(front == null) {
			System.out.println()
		}
		
		
		
	}

	public static void main(String[] args) {
		

	}

}
