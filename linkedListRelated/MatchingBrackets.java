package linkedListRelated;

public class MatchingBrackets {

	public static ListNodeChar checkBrackets(ListNodeChar head) {

		ListNodeChar currentNode = head;
		ListNodeChar openNode = null, closeNode = null; 
		while(currentNode != null) {
			if(currentNode.val == '('){
				openNode = currentNode;
			}
			else if(currentNode.val == ')'){
				closeNode = currentNode;
				if(openNode == null) {					
					return head;
				}
					
				else if( openNode.prev == null )
				{
					head = closeNode.next;
					openNode = null;
				}
				else	
					openNode.prev = closeNode.next;
			}
			currentNode = currentNode.next;
		}

		return head;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNodeChar a = new ListNodeChar(')');
		ListNodeChar b = new ListNodeChar('(');
		ListNodeChar c = new ListNodeChar(')');
		ListNodeChar d = new ListNodeChar('(');
		
		ListNodeChar head = a;
		a.next = b;
		a.prev = null;
		b.next = c;
		b.prev = a;
		c.next = d;
		c.prev = b;
		d.next = null;
		d.prev = c;
		
		head = checkBrackets(head);
		if(head!= null) {
			System.out.println("Brackets don't match");
		}
		while(head!=null) {
			System.out.println(head.val);
			head = head.next;
		}
		
	}

}
