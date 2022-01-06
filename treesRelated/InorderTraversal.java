package treesRelated;

import java.util.ArrayList;
import java.util.List;


public class InorderTraversal {
	static List<Integer> mylist = new ArrayList<Integer>();
	public static List<Integer> inorderTraversal(TreeNode root) {
		if(root == null) 
            return mylist;
        
        inorderTraversal(root.left);
        mylist.add(root.val);
        inorderTraversal(root.right);

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
		inorderTraversal(a);
		System.out.println(mylist);
		
	}

}
