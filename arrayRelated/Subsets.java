package arrayRelated;

import java.util.ArrayList;
import java.util.List;

public class Subsets {

	public static void rec(int[] nums, int i, List<Integer> curr, List<List<Integer>> result) {
		if(i == nums.length) {
			result.add(new ArrayList<Integer>(curr));
			return;
		}
		curr.add(nums[i]);
		rec(nums, i+1, curr, result);
		curr.remove(curr.size() - 1);
		rec(nums, i+1, curr, result);		
	}
	public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        List<Integer> curr = new ArrayList<Integer>();
        rec(nums, 0, curr, result);
        
        return result;
    }
	
	public static void main(String[] args) {
		int[] nums = {1,2,3};
		List<List<Integer>> result = subsets(nums);
		System.out.println(result);
	}

}
