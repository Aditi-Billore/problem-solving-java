package treesRelated;

public class InvertBinaryTree {

	public static void invertTreeHelper(TreeNode root) {
		if(root.left == null && root.right == null) {
			return;
		}
		else {
			TreeNode temp = root.left;
			root.left = root.right;
			root.right = temp;
		}
		
		invertTreeHelper(root.left);
		invertTreeHelper(root.right);
	}
	
	public static TreeNode invertTree(TreeNode root) {
		invertTreeHelper(root);
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
		TreeNode f = new TreeNode(6);
		TreeNode g = new TreeNode(9);
		a.left = b;
		a.right = c;
		b.left = d;
		b.right = e;
		c.left = f;
		c.right = g;

		System.out.println("=============== normal tree ========");
		display(a);
		System.out.println("\n===============");
		TreeNode res = invertTree(a);

		System.out.println("=============== result tree ========");
		display(res);
		System.out.println("\n===============");
	}

}
