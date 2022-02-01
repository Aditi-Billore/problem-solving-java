package linkedListRelated;

public class ListNodeChar {
	char val;
	ListNodeChar prev;
	ListNodeChar next;
	
	public ListNodeChar() {
		this.val = 0;
		this.next = null;
	}
	
	public ListNodeChar(char val) {
		this.val = val;
		this.next = null;
		this.prev = null;
	}
	
	public ListNodeChar(char val, ListNodeChar node) {
		this.val = val;
		this.next = node;
	}
	
}
