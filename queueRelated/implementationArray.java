package queueRelated;



public class implementationArray {
	
	public static void main(String[] args) {
		Queue myqueue = new Queue();
		System.out.println("Head of queue is "+myqueue.peek());
		for(int i =10;i<20;i++) {
			myqueue.add(i);
		}
		System.out.println("Head of queue is "+myqueue.peek());
		System.out.println("Removed Element is "+myqueue.remove());
		System.out.println("Removed Element is "+myqueue.remove());
		System.out.println("Removed Element is "+myqueue.remove());
		System.out.println("Head of queue is "+myqueue.peek());
	}
	
}
