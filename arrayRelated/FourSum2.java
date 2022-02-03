package arrayRelated;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * LC 454. 4Sum II
 * 
 * Given four integer arrays nums1, nums2, nums3, and nums4 
 * all of length n, return the number of tuples (i, j, k, l) such that:
 * 
 * 0 <= i, j, k, l < n 
 * nums1[i] + nums2[j] + nums3[k] + nums4[l] == 0
 */
public class FourSum2 {

	public static int fourSumCountHash(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
		Map<Integer, Integer> map = new HashMap<>();
		int count = 0;
		for(int i: nums1) 
			for(int j: nums2) 
				map.put(i+j, map.getOrDefault(i+j, 0)+1);
			
		for(int i: nums3) 
			for(int j: nums4) 
				count +=  map.getOrDefault(-(i+j), 0);
		
		
		return count;
	}
	public static int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
     
		int count = 0;
		List<Integer> sum12 = new ArrayList<Integer>();
		List<Integer> sum34 = new ArrayList<Integer>();
		
		for(int i =0;i < nums1.length;i++) {
			for(int j=0;j< nums2.length; j++) {
				sum12.add(nums1[i]+ nums2[j]);
			}
		}
		
		for(int i =0;i < nums3.length;i++) {
			for(int j=0;j< nums4.length; j++) {
				sum34.add(nums3[i]+ nums4[j]);
			}
		}
     
		for(int i =0;i< sum12.size(); i++) {
			int target = 0 - sum12.get(i);
			if(sum34.contains(target)) {
				count++;
			}
		}
		return count;
 }
	public static void main(String[] args) {
		int nums1[]  = {1,2};
		int nums2[]  = {-2,-1};
		int nums3[]  = {-1,2};
		int nums4[]  = {0,2};
//		int nums1[]  = {-1,-1};
//		int nums2[]  = {-1,1};
//		int nums3[]  = {-1,1};
//		int nums4[]  = {1,-1};
		System.out.println(fourSumCount(nums1,nums2,nums3,nums4));
		System.out.println(fourSumCountHash(nums1,nums2,nums3,nums4));
	}
}
