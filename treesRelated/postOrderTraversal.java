package treesRelated;

import java.util.ArrayList;
import java.util.List;

public class postOrderTraversal {
	static List<Integer> mylist = new ArrayList<Integer>();
	
	public static List<Integer> postorderTraversal(TreeNode root) {
		if(root == null) 
            return mylist;
        
        postorderTraversal(root.left);
        postorderTraversal(root.right);
        mylist.add(root.val);
        
        return mylist;
		

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
		postorderTraversal(a);
		System.out.println(mylist);
		
	}
}
