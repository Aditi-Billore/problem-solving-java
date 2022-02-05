package arrayRelated;

import java.util.HashMap;

public class ContiguousArray01 {
	public static int findMaxLength(int[] nums) {
		
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		map.put(0, -1); //initialize base case
		int maxCount = 0;
		int sum = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 0) {
				sum += -1;
			} else if (nums[i] == 1) {
				sum += 1;
			}
			if (map.containsKey(sum)) {
				int index = map.get(sum);
				System.out.println("======= "+ sum);
				maxCount = Math.max(maxCount, i - index );
			}
			else {
				map.put(sum, i);
				System.out.println("+++++ "+ sum + " --- "+ i);
			}
		}
		if(maxCount == 0 && sum == 0) {
			maxCount = nums.length;
		}
		return maxCount;
	}

	public static void main(String[] args) {
		int[] nums = { 0,1,1};
		System.out.println(findMaxLength(nums));
	}
}
