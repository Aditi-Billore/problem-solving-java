package arrayRelated;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class kDiffPair {

	public static int findPairs(int[] nums, int k) {
		Set<ArrayList<Integer>> list = new HashSet<>();
		for(int i = 0;i< nums.length; i++) {
			for(int j = i+1;j< nums.length; j++) {
				if( Math.abs(nums[i] - nums[j]) == k) {
					ArrayList<Integer> l = new ArrayList<Integer>();
					l.add(nums[i]);
					l.add(nums[j]);
					Collections.sort(l);
					list.add(l);
				}
			}
		}
		list.forEach((li)->{
			System.out.println(li);
		});
		return list.size();
    }
	
	public static int findPairBinary(int[] nums, int k) {
		Arrays.sort(nums);
		Set<Integer> list = new HashSet<>();
		for(int i = 0;i< nums.length; i++) {
			if(Arrays.binarySearch(nums, i + 1, nums.length, nums[i] + k) > 0){
                list.add(nums[i]);
            }
		}
		return list.size();
	}
	public static void main(String[] args) {
		int[] nums = {1,2,4,4,3,3,0,9,2,3};
		int k = 3;
		System.out.println(findPairs(nums, k));
	}

}
