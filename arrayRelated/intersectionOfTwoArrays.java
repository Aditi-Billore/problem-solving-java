package arrayRelated;


/*
 * Given two integer arrays nums1 and nums2, 
 * return an array of their intersection. 
 * Each element in the result must appear as many 
 * times as it shows in both arrays and you may return 
 * the result in any order.
 * 
 */

import java.util.ArrayList;
import java.util.Arrays;

public class intersectionOfTwoArrays {

	public static int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> numsList = new ArrayList<>();
        int indexA = 0,indexB = 0;
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        
        while(indexA <nums1.length-1 || indexB < nums2.length-1) {
        	if(nums1[indexA] == nums2[indexB]) {
        		numsList.add(nums1[indexA]);
        		indexA++;
        		indexB++;
        	}
        	else if(nums1[indexA] <nums2[indexB]) {
        		indexA++;
        	}
        	else {
        		indexB++;
        	}        	
        }

        int[] array = numsList.stream().mapToInt(i -> i).toArray();;
        
        return array;
    }
	
	public static void main(String[] args) {
		int[] nums1 = {4,9,5};
		int[] nums2 = {9,4,9,8,4};
		int[] result = intersect(nums1,nums2);
		for(int num:result) {
        	System.out.println(num);
        }
	}

}
