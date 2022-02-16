package arrayRelated;

import java.util.HashMap;

/*
 * Given an array nums of size n, return the majority element.
 * 
 * The majority element is the element that appears more than n/2
 * times. You may assume that the majority element always exists in the array.
 * 
 */

public class MajorityElement {

	public static int majorityElement(int[] nums) {
        
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        
        for(int num: nums){
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        
        for(int key: map.keySet()) {
        	if( map.get(key) > nums.length/2) {
        		return key;
        	}
        }
        return 0;
        
    }

	public static void main(String[] args) {
		int[] nums = { 3,2,3 };

		System.out.println(majorityElement(nums));
	}

}
