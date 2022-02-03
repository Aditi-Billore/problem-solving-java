package arrayRelated;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/*
 * LC : 18. 4Sum
 * 
 * Given an array nums of n integers, return an array of all the unique 
 * quadruplets [nums[a], nums[b], nums[c], nums[d]] such that:
 * 
 * 0 <= a, b, c, d < n 
 * a, b, c, and d are distinct.  
 * nums[a] + nums[b] + nums[c] + nums[d] == target  
 * 
 * You may return the answer in any order.
 */

public class FourSum {
	public static List<List<Integer>> fourSum(int[] nums, int target) {
		Arrays.sort(nums);
        List<List<Integer>> totalSum = new ArrayList<List<Integer>>();
        if(nums.length == 0) {
        	return totalSum;
        }
        int n = nums.length;
		for(int i =0;i< n-3; i++){
            for(int j=i+1;j< n-2; j++){
            	int tempTarget = target - nums[i] - nums[j];
            	
            	int front = j + 1;
            	int back = n - 1;
            	
            	while(front < back) {
            		
            		int sum = nums[front] + nums[back];
            		
            		if(sum < tempTarget) front ++;
            		
            		else if( sum > tempTarget ) back --;
            		else {
            			List<Integer> quad = new ArrayList<Integer>();
            			quad.add(nums[i]);
            			quad.add(nums[j]);
            			quad.add(nums[front]);
            			quad.add(nums[back]);
            			totalSum.add(quad);
            			
            			while(front < back && nums[front] == quad.get(2)) ++front;
            			while(front < back && nums[back] == quad.get(3)) --back; 
            		}
            	}

        		while( j+ 1 < n-2 && nums[j+1] == nums[j]) ++j;	
            }
    		while( i+ 1 < n-3 && nums[i+1] == nums[i]) ++i;
        }
        return totalSum;
    }
	
	public static void main(String[] args) {
		int[] nums = {1,0,-1,0,-2,2};
		int target = 0;
		
		List<List<Integer>> result = fourSum(nums, target);
		System.out.println(result);
	}
	
}
