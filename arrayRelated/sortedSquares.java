package arrayRelated;

import java.util.Arrays;

// given a sorted array of integers, write algorithm to keep their squares sorted as well
public class sortedSquares {

	public static int[] sortedSquaresArray(int[] nums) {
		for(int i =0;i< nums.length; i++) {
			nums[i] *= nums[i];
		}
		Arrays.sort(nums);
		return nums;
	}
	public static void main(String[] args) {
		int[] nums = {-3,1,2,4};
		nums = sortedSquaresArray(nums);
		
		for(int num:nums) {
			System.out.println(num);
		}
	}
}
