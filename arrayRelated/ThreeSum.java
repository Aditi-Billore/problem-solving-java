package arrayRelated;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class ThreeSum {
	public static List<Integer[]> threeNumberSum(int[] array, int targetSum) {
	    HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
	    ArrayList<Integer[]> list = new ArrayList<Integer[]>();
			for(int i =0;i< array.length; i++){
				for(int j=i+1;j< array.length;j++){
					int sum = array[i] + array[j];
					map.put(sum, array[j]);
				}
			}
			
			
			for(int i =0;i< array.length; i++) {
				int num = targetSum - array[i];
				if(map.containsKey(num)) {
					Integer[] nums = new Integer[3];
					nums[0] = array[i];
					nums[1] = map.get(num);
					nums[2] = num - nums[1];
					Arrays.sort(nums);
					for(int n: nums) {
						System.out.print(n+ " ===");
					}
					if(!list.contains(nums))
						list.add(nums);
					map.remove(num);
				}
			}
			
	    return list;
	  }
	public static void main(String[] args) {
		int[] nums = {12,3,1,2,-6, 5,-8, 6};
		List<Integer[]> lists = threeNumberSum(nums, 0);
		for(Integer[] list: lists) {
			for(int num: list) {
				System.out.print(num + " ");
			}
			System.out.println(" ");
		}
	}

}
