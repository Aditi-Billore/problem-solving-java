package arrayRelated;

import java.util.Arrays;
/*
 * Given a non-empty array of integers nums, 
 * every element appears twice except for one. Find that single one.
 * 
 * You must implement a solution with a linear runtime complexity and 
 * use only constant extra space.
 * 
 */
public class singleNumber {

	public static int singleNumberBruteForce(int[] nums) {
        if(nums.length == 1){
            return nums[0];
        }
        Arrays.sort(nums);
        for(int i = 0;i< nums.length-1; i = i+2){
            System.out.println(nums[i]);
            if(nums[i] != nums[i+1]){
                return nums[i];
            }
        }
        if(nums[nums.length-1] != nums[nums.length-2])
            return nums[nums.length-1];        
        return 0;
    }
	
	public static int singleNumberMethod(int[] nums) {
        int unique = 0;
        for(int num: nums) {
        	unique ^= num;
        }
        return unique;
    }
	public static void main(String[] args) {
		int[] nums = {4,1,2,1,2};
		System.out.println(singleNumberMethod(nums));
	}

}
