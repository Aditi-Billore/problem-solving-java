package linkedListRelated;

public class SwapNodesInPair {
	public static ListNode swapPairs(ListNode head) {
        ListNode dummyHead = new ListNode(0, head);
		ListNode prev = dummyHead, curr = head;
        
		while( curr != null && curr.next != null ) {
			//initialize
			System.out.println(curr.val);
			ListNode nextPair = curr.next.next;
			ListNode secondNode = curr.next;
			
			//reversing the pair
			curr = secondNode.next;
			secondNode.next = curr;
			prev.next = secondNode;
			
			//update nodes
			prev = curr;
			curr = nextPair;
			
		}
        
        return dummyHead.next;
    }
	
	public static ListNode swapPairsRec(ListNode head) {
		if(head == null || head.next == null) return head;
		
		ListNode tHead = swapPairsRec(head.next.next);
		
		ListNode temp = head.next;
        head.next = tHead;
        temp.next = head;
        return temp;
    }
	public static void main(String[] args) {
		ListNode a = new ListNode(1);
		ListNode b = new ListNode(2);
		ListNode c = new ListNode(3);
		ListNode d = new ListNode(4);
		ListNode e = new ListNode(5);
		
		ListNode head = a;
		a.next = b;
		b.next = c;
		c.next = d;
		d.next = e;
		
		head = swapPairsRec(head);
		
		while(head != null) {
			System.out.print(head.val + " -> ");
			head = head.next;
		}
	}

}
