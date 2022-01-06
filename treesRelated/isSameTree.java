package treesRelated;

/*
 * 
 * 
 * Given the roots of two binary trees p and q, 
 * write a function to check if they are the same or not.
 * 
 * Two binary trees are considered the same if they are structurally identical, 
 * and the nodes have the same value.
 *
 * Input: p = [1,2,3], q = [1,2,3] 
 * Output: true
 */
public class isSameTree {

	public static boolean isSameTreeMethod(TreeNode p, TreeNode q) {
        if(p == null && q == null){
            return true;
        }
        else{
            if(p==null || q==null || p.val != q.val)
                return false;
            return isSameTreeMethod(p.left, q.left) && 
            			isSameTreeMethod(p.right, q.right);
        }
    }
	public static void main(String[] args) {
		TreeNode a = new TreeNode(1);
		TreeNode b = new TreeNode(2);
		a.right = null;
		a.left = b;
		
		TreeNode x = new TreeNode(1);
		TreeNode y = new TreeNode(2);
		x.left = null;
		x.right = y;
		
		System.out.println(isSameTreeMethod(a,x));		

	}

}
