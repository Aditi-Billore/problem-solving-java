package arrayRelated;


/*
 * Given an array nums containing n distinct numbers 
 * in the range [0, n], return the only number in the 
 * range that is missing from the array.
 */

import java.util.Arrays;
public class missingNumber {

    public static int missingNumberMethod(int[] nums) {
        Arrays.sort(nums);
        for(int i =0;i<nums.length; i++){
            if(i != nums[i]){
                return i;
            }
        }
        
        return nums.length;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {9,6,4,2,3,5,7,0,1};
		System.out.println(missingNumberMethod(nums));
	}

}
