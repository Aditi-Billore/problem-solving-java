package treesRelated;

/*
 * Given a binary search tree (BST), 
 * find the lowest common ancestor (LCA) of two given nodes in the BST.
 * 
 * According to the definition of LCA on Wikipedia: 
 * 
 * ?The lowest common ancestor is defined between two nodes p and 
 * q as the lowest node in T that has both p and q as descendants 
 * (where we allow a node to be a descendant of itself).?
 * 
 */

public class LCAOfTwoNodes {

	public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if( root == null)
            return null;
        
        if(root.val > p.val && root.val > q.val){
            return lowestCommonAncestor(root.left, p,q);
        }
        
        if(root.val < p.val && root.val < q.val){
            return lowestCommonAncestor(root.right, p,q);
        }
        
        return root;
    }
	public static void main(String[] args) {
		TreeNode a = new TreeNode(1);
		TreeNode b = new TreeNode(2);
		TreeNode c = new TreeNode(2);
		a.right = c;
		a.left = b;
		
		
		System.out.println(lowestCommonAncestor(a, a,b).val);		
	}

}
