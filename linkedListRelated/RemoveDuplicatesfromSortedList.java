package linkedListRelated;

/*
 * Given the head of a sorted linked list, 
 * delete all duplicates such that each element appears only once. 
 * Return the linked list sorted as well.
 */
public class RemoveDuplicatesfromSortedList {

	public static ListNode deleteDuplicates(ListNode head) {
		if(head == null || head.next == null)
			return head;
		ListNode temp = head;
		
		while(temp!=null && temp.next!= null) {
			
			if(temp.next.val == temp.val) {
				temp.next = temp.next.next;
			}
			else {
				temp = temp.next;
			}
		}
        return head;
    }
	public static void main(String[] args) {
		
		ListNode a = new ListNode(1);
		ListNode b = new ListNode(1);
		ListNode c = new ListNode(2);
		ListNode d = new ListNode(3);
		ListNode e = new ListNode(3);
		
		ListNode head = a;
		a.next = b;
		b.next = c;
		c.next = d;
		d.next = e;
		
		head = deleteDuplicates(head);
		while(head!=null) {
			System.out.println(head.val);
			head = head.next;
		}

	}

}
