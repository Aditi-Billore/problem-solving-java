package treesRelated;

/*
 * 
 * Given the root of a binary tree and an integer targetSum, 
 * return true if the tree has a root-to-leaf path such that 
 * adding up all the values along the path equals targetSum.
 * 
 * A leaf is a node with no children.
 * 
 */
public class PathSum {

	public static boolean hasPathSum(TreeNode root, int targetSum) {
		if (root == null)
			return false;
		if (root.left == null && root.right == null) {
			if (targetSum - root.val == 0) {
				return true;
			}
			return false;
		}
		return hasPathSum(root.left, targetSum - root.val) || hasPathSum(root.right, targetSum - root.val);
	}

	public static void main(String[] args) {

		TreeNode a = new TreeNode(1);
		TreeNode b = new TreeNode(2);
		TreeNode c = new TreeNode(3);
		a.left = null;
		a.right = b;
		b.left = c;
		b.right = null;
		c.left = null;
		c.right = null;
		System.out.println(hasPathSum(a, 100));
	}

}
