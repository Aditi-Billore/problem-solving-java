package treesRelated;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeLevelOrder {

	public static List<List<Integer>> levelOrderHelper(TreeNode root, List<List<Integer>> list, int level) {
		
		if(root == null) {
			return list;
		}
		
		if(list.size() < level + 1) {
			List<Integer> tempList = new ArrayList<Integer>();
			list.add(tempList);
		}
		
		list.get(level).add(root.val);
		
		list = levelOrderHelper(root.left, list, level + 1);
		list = levelOrderHelper(root.right, list, level + 1);
		
		return list;		
	}
	public static List<List<Integer>> levelOrder(TreeNode root) {
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		list = levelOrderHelper(root, list, 0);
		return list;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode a = new TreeNode(3);
		TreeNode b = new TreeNode(9);
		TreeNode c = new TreeNode(20);
		TreeNode d = new TreeNode(15);
		TreeNode e = new TreeNode(7);
		a.left = b;
		a.right = c;
		b.left = null;
		b.right = null;
		c.left = d;
		c.right = e;
		d.left = null;
		d.right = null;
		e.left = null;
		e.right = null;
		System.out.println(levelOrder(a));
	}

}
