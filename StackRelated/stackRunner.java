package StackRelated;


public class stackRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StackArray mystack = new StackArray();
		System.out.println("Head of mystack is "+mystack.peek());
		for(int i =10;i<20;i++) {
			mystack.push(i);
		}
		System.out.println("Head of mystack is "+mystack.peek());
		System.out.println("Removed Element is "+mystack.pop());
		System.out.println("Removed Element is "+mystack.pop());
		System.out.println("Removed Element is "+mystack.pop());
		System.out.println("Head of mystack is "+mystack.peek());
	}

}
