package arrayRelated;

import java.util.Arrays;

/*
 * 
 * Given an integer array nums, 
 * return true if any value appears at least twice 
 * in the array, and return false if every element is distinct.
 * 
 */
public class duplicatesInArray {

	public static boolean containsDuplicate(int[] nums) {
//        Set<Integer> unique = new HashSet<Integer>();
//        
//        for(int num: nums){
//            unique.add(num);
//        }
//        
//        if(unique.size() == nums.length) {
//        	return false;
//        }
//        return true;
		
		Arrays.sort(nums);
		
		for(int i = 0;i<nums.length-1; i++) {
			if(nums[i] == nums[i+1]) {
				return true;
			}
		}
		return false;
    }
	public static void main(String[] args) {
		int[] nums = {1,2,3,1};
		System.out.println(containsDuplicate(nums));

	}

}
