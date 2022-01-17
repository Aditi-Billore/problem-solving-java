package treesRelated;


/*
 * Given the root of a binary tree, check whether it is a mirror of itself 
 * (i.e., symmetric around its center).
 */

public class SymmetricTree {
	public static boolean isSymmetric(TreeNode root) {
        if(root ==null)
            return true;
        
        return isSymmetry(root.left, root.right);
    }
    
    public static boolean isSymmetry(TreeNode left, TreeNode right){
        if(left == null && right == null){
            return true;
        }
        
        if(left == null || right == null ){
            return false;
        }
        
        if(left.val != right.val){
            return false;
        }
        
        if(!isSymmetry(left.right, right.left) || !isSymmetry(left.left, right.right)){
            return false;
        }
        
        return true;
    } 
    
    public static void main(String[] args) {
		TreeNode a = new TreeNode(1);
		TreeNode b = new TreeNode(2);
		TreeNode c = new TreeNode(2);
		a.right = c;
		a.left = b;
		
		
		System.out.println(isSymmetric(a));		

	}
}
