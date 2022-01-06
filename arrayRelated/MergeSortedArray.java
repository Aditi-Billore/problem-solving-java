package arrayRelated;

import java.util.Arrays;

public class MergeSortedArray {

	public static void merge(int[] nums1, int m, int[] nums2, int n) {
        System.arraycopy(nums2, 0, nums1, m, n);
        Arrays.sort(nums1);
    }
	public static void main(String[] args) {

		int[] nums1 = {1,2,3,0,0,0};
		int[] nums2 = {2,5,6};
		
		merge(nums1, 3, nums2, 3);
		
		for(int num: nums1) {
			System.out.println(num);
		}
	}

}
