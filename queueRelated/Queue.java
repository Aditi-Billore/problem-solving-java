package queueRelated;

//Queue implementation using array 
// add, peek, remove, 
public class Queue {
	final int MAX_SIZE = 10;
	int[] queue = new int[MAX_SIZE];
	int top = 0;
	
	public void add(int num) {
		if(top < MAX_SIZE ) {
			queue[top++] = num;
		}
		else {
			System.out.println("Queue Full");
		}
	}
	
	public int peek() {
		if(isEmpty()) {
			System.out.println("Queue empty");
			return -1;
		}
		return queue[0];
	}
	
	public int remove() {
		int ele = -1;
		if(isEmpty()) {
			System.out.println("Queue empty");
		}
		else {
			ele = queue[0];
			for(int i=0;i<top-1;i++) {
				int temp = queue[i];
				queue[i] = queue[i+1];
				queue[i+1] = temp;
			}
			top--;
		}
		return ele;
	}
	
	public boolean isEmpty() {
		return top==0?true:false;
	}
}
