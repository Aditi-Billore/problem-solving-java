package arrayRelated;

/*
 * 75. Sort Colors
 * 
 * Given an array nums with n objects colored red, white, or blue, 
 * sort them in-place so that objects of the same color are adjacent, 
 * with the colors in the order red, white, and blue.
 * 
 * We will use the integers 0, 1, and 2 to represent the color red,
 *  white, and blue, respectively.
 *  
 *  You must solve this problem without using the library's sort function
 * 
 */
public class SortColors {

	public static void sortColorsBrute(int[] nums) {
        for(int i =0;i< nums.length; i++){
            for(int j = i+1; j< nums.length; j++){
                if(nums[i]>nums[j]){
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
    }
	
	public static void sortColors(int[] nums) {
		int zeroIndex = 0;
		int oneIndex = 0;
		int twoIndex = nums.length -1;
		while(oneIndex <= twoIndex) {
			System.out.println(oneIndex);
			if(nums[oneIndex] == 1) {
				oneIndex++;
			}
			else if(nums[oneIndex] == 0) {
				swap(nums,oneIndex, zeroIndex);
				zeroIndex++;
				oneIndex++;
			}
			else {
				swap(nums,oneIndex, twoIndex);
				twoIndex--;
			}
		}
	}
	public static void swap(int[] nums, int start, int end) {
		int temp = nums[start];
		nums[start] = nums[end];
		nums[end] = temp;
	}
	public static void main(String[] args) {
		int[] nums = {2,0,2,1,1,0};
		sortColors(nums);
		for(int i: nums)
			System.out.print(i + " ");
	}
}
