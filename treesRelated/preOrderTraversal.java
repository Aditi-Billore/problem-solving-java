package treesRelated;

import java.util.ArrayList;
import java.util.List;

public class preOrderTraversal {
	static List<Integer> mylist = new ArrayList<Integer>();
	
	public static List<Integer> preorderTraversal(TreeNode root) {
		if(root == null) 
            return mylist;

        mylist.add(root.val);
		preorderTraversal(root.left);
		preorderTraversal(root.right);
        
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
		preorderTraversal(a);
		System.out.println(mylist);
		
	}

}
