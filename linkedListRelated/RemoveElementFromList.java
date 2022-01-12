package linkedListRelated;

/*
 * Given the head of a linked list and an integer val, 
 * remove all the nodes of the linked list that has 
 * Node.val == val, and return the new head.
 */
public class RemoveElementFromList {

	public static ListNode removeElements(ListNode head, int val) {
        ListNode Temp = new ListNode();
        
        if(head == null){
            return head;
        }
        else if(head.val == val){
             return removeElements(head.next, val);
        }
        Temp = head;
        while(Temp != null && Temp.next != null){
            if(Temp.next.val == val){
                Temp.next = Temp.next.next;
            }
            else{
                Temp = Temp.next;    
            }            
        }
        return head;
    }
	public static void main(String[] args) {
		ListNode a = new ListNode(1);
		ListNode b = new ListNode(2);
		ListNode c = new ListNode(3);
		ListNode d = new ListNode(4);
		ListNode e = new ListNode(2);
		
		ListNode head = a;
		a.next = b;
		b.next = c;
		c.next = d;
		d.next = e;
		
		head = removeElements(head, 2);
		while(head!=null) {
			System.out.println(head.val);
			head = head.next;
		}

	}

}
