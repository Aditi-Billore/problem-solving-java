package treesRelated;

public class InsertIntoBST {

	public static TreeNode insertIntoBST(TreeNode root, int val) {

		if(root == null) {
			TreeNode newNode = new TreeNode(val);
			root = newNode;
			return root;
		}
		
		if(root != null) {
			if(root.val>=val) {
				root.left = insertIntoBST(root.left, val);
			}
			else {
				root.right = insertIntoBST(root.right, val);
			}
		}
		
		return root;
	}

	public static void display(TreeNode root) {
		if(root == null)
			return;

		System.out.print(root.val + "  ");
		display(root.left);
		display(root.right);
		
	}
	
	public static void main(String[] args) {
		TreeNode a = new TreeNode(4);
		TreeNode b = new TreeNode(2);
		TreeNode c = new TreeNode(7);
		TreeNode d = new TreeNode(1);
		TreeNode e = new TreeNode(3);
		a.left = b;
		a.right = c;
		b.left = d;
		b.right = e;

		a = insertIntoBST(a, 5);
		display(a);
	}

}
