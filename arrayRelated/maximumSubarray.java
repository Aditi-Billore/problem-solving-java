package arrayRelated;

/*
 * Given an integer array nums, find the contiguous subarray (containing at least one number) 
 * which has the largest sum and return its sum.
 * A subarray is a contiguous part of an array
 * 
 * Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
 * Output: 6
 * Explanation: [4,-1,2,1] has the largest sum = 6.
 * 
 */

public class maximumSubarray {

	public static void main(String[] args) {
		int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
		int max = Integer.MIN_VALUE;
		int sum = 0;
		
		for(int i =0;i< nums.length; i++) {
			sum += nums[i];
			
			max = Math.max(max, sum);
			
			if(sum<0) {
				sum = 0;
			}
		}
		System.out.println(max);
		
		

	}

}
