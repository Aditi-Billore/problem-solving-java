package arrayRelated;

/*
 * Given n non-negative integers representing an elevation map 
 * where the width of each bar is 1, compute how much water 
 * it can trap after raining.
 */

public class TrappingWater {
	
	public static long trappingRainWater(int arr[], int n) { 
        
        int rainWater=0, diff;
    
        int[] left = new int[n];
        int[] right = new int[n];
        
        
        left[0] = arr[0];
        right[n-1] = arr[n-1];
        for(int i = 1;i< n; i++) {
        	left[i] = Math.max(left[i-1], arr[i]);
        }
        
        for(int j = n-2; j>=0;j--) {
        	right[j] = Math.max(right[j+1], arr[j]);
        }
        
        for(int i =0;i< n;i++) {
        	diff = Math.min(left[i], right[i]);
        	rainWater += diff - arr[i];
        }
                
        return rainWater;
    }
	
	
	public static void main(String[] args) {
//		int[] nums = {7,4,0,9};
//		int[] nums = {8,8,2,4,5,5,1};
		int[] nums = {1,1,5,2,7,6,1,4,2,3};
		System.out.println("water trapped: " + trappingRainWater(nums, nums.length));
	}
}
