package treesRelated;

/*
 * Given the root of a binary tree, return its maximum depth.
 * 
 * A binary tree's maximum depth is the number of nodes along the 
 * longest path from the root node down to the farthest leaf node.
 * 
 */
public class MaxDepth {
	public static int maxDepth(TreeNode root) {
        if(root== null)
            return 0;
        return Math.max(1+ maxDepth(root.left), 1+ maxDepth(root.right));
    }
	
	public static void main(String[] args) {
		TreeNode a = new TreeNode(1);
		TreeNode b = new TreeNode(2);
		a.right = null;
		a.left = b;
		
		
		System.out.println(maxDepth(a));		

	}
}
