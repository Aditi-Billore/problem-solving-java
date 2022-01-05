package StackRelated;

public class StackArray {

	final int MAX_SIZE = 10;
	int[] stack = new int[MAX_SIZE];
	int top = 0;
	
	public void push(int num) {
		if(top < MAX_SIZE ) {
			stack[top++] = num;
		}
		else {
			System.out.println("Stack Full");
		}
	}
	public int pop() {
		int ele = -1;
		if (isEmpty()) {
			System.out.println("Stack empty");
		}
		else {
			ele = peek();
			top--;
		}
		return ele;
	}
	
	public int peek() {
		if(isEmpty()) {
			System.out.println("Stack empty");
			return -1;
		}
		return stack[top -1];
	}
	
	public boolean isEmpty() {
		return top==0?true:false;
	}
}
