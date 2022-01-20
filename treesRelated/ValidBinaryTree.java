package treesRelated;


/*
 * Given the root of a binary tree, determine if it 
 * is a valid binary search tree (BST).
 * A valid BST is defined as follows:
 * 
 * The left subtree of a node contains only nodes with keys less than the node's key.
 * The right subtree of a node contains only nodes with keys greater than the node's key.
 * Both the left and right subtrees must also be binary search trees.
 * 
 */
public class ValidBinaryTree {

	public static boolean isValidNode( TreeNode root, long min, long max ){
        if(root == null){
            return true;
        }
        else if( root.val <= min || root.val >= max ){
            return false;
        }
        else{
            return isValidNode(root.left, min, root.val) &&
                isValidNode(root.right, root.val, max);
        }
    }
    public static boolean isValidBST(TreeNode root) {
        return isValidNode(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }
	public static void main(String[] args) {
		TreeNode a = new TreeNode(2);
		TreeNode b = new TreeNode(1);
		TreeNode c = new TreeNode(3);
		a.right = c;
		a.left = b;
		
		
		System.out.println(isValidBST(a));		

	}

}
