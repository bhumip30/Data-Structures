package queue;

class Queue{
	private int queue[];
	private int maxSize;
	private int front;
	private int rare;
	
	
	public Queue(int maxSize) {
		this.maxSize = maxSize;
		this.queue = new int[maxSize];
		this.front = 0;
		this.rare = -1;
	}
	
	public void enqueue(int data) {
		if(rare == maxSize - 1) {
			System.out.println("Queue is full......");
			return;
		}
		rare = rare + 1;
		queue[rare] = data;
	}
	
	public int dequeue() {
		if(front > rare) {
			System.out.println("Queue is empty...");
			return -1;
		}
		int data = queue[front];
		front++;
		return data;
	}
	
	public int peek() {
		return queue[front];
	}
	
	public void display() {
		for(int i = front; i <= rare; i++) {
			System.out.println("Queue Elements: " + queue[i]);
		}
		System.out.println();
	}
	
}

public class QueueDemo {

	public static void main(String[] args) {
		Queue queue = new Queue(5);
		
		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(30);
		queue.enqueue(40);
		queue.enqueue(50);
		//queue.enqueue(60);
		queue.display();
		System.out.println("peek element: " + queue.peek());
		
		System.out.println("Element remove: "+ queue.dequeue());
		System.out.println("Element remove: "+ queue.dequeue());
		System.out.println("Element remove: "+ queue.dequeue());
		System.out.println("Element remove: "+ queue.dequeue());
		System.out.println("Element remove: "+ queue.dequeue());
		System.out.println("Element remove: "+ queue.dequeue());
		
		queue.display();
		
		//System.out.println("peek element: " + queue.peek());

	}

}
