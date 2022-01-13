package linkedListRelated;

public class ReverseLinkedList {

	public static ListNode reverseList(ListNode head) {
		if(head == null || head.next == null) {
			return head;
		}
		ListNode curr = new ListNode(head.val);
		ListNode prev = new ListNode(head.val);
		ListNode temp = head.next;
		
		while(temp!= null) {
			curr = new ListNode(temp.val);
			curr.next = prev;
			prev = curr;
			temp = temp.next;
		}
		
        return curr;
    }
	public static void main(String[] args) {
		ListNode a = new ListNode(1);
		ListNode b = new ListNode(2);
		ListNode c = new ListNode(3);
		ListNode d = new ListNode(4);
		
		ListNode head = a;
		a.next = b;
		b.next = c;
		c.next = d;
		
		head = reverseList(head);
		while(head!=null) {
			System.out.println(head.val);
			head = head.next;
		}
	}

}
