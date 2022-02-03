package arrayRelated;

import java.util.Arrays;

/*
 * 31. Next Permutation
 * 
 * The next permutation of an array of integers is the next 
 * lexicographically greater permutation of its integer. 
 * More formally, if all the permutations of the array are 
 * sorted in one container according to their lexicographical order, 
 * then the next permutation of that array is the permutation that 
 * follows it in the sorted container. If such arrangement is not 
 * possible, the array must be rearranged as the lowest possible 
 * order (i.e., sorted in ascending order).
 * 
 * For example, the next permutation of arr = [1,2,3] is [1,3,2].
 * Similarly, the next permutation of arr = [2,3,1] is [3,1,2].
 * 
 */
public class NextPermutation {
	public static void nextPermutation(int[] nums) {
		int firstMin = -1;
		for (int i = nums.length - 2; i >= 0; i--) {
			if (nums[i] < nums[i + 1]) {
				firstMin = i;
				break;
			}
		}
		if (firstMin == -1) {
			Arrays.sort(nums);
			return;
		}
		for (int i = nums.length - 1; i >= 0; i--) {
			if (nums[i] > nums[firstMin]) {
				swap(nums, i, firstMin);
				break;
			}
		}
		reverse(nums, firstMin + 1, nums.length - 1);

	}

	public static void reverse(int[] nums, int start, int end) {
		
		while (start < end) {
			swap(nums, start, end);
			start++;
			end--;
		}
	}

	public static void swap(int[] nums, int start, int end) {
		int temp = nums[start];
		nums[start] = nums[end];
		nums[end] = temp;
	}

	public static void main(String[] args) {
		int[] nums = { 3, 2, 1 };
		nextPermutation(nums);
		for (int i : nums)
			System.out.print(i + " ");
	}
}
