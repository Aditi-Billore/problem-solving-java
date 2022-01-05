package arrayRelated;

import java.util.HashMap;

public class twoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {2,7,11,15};
		int target = 9;
		int[] result = new int[2];
		
		//Brute Force Time O(n^2)
    	for(int i = 0;i< nums.length-1; i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j] == target){
                    result[0] = i;
                    result[1] = j;
                }
            }
        }
		
		//HashMap Implementation  Time: O(n)
    	HashMap<Integer, Integer> testSet = new HashMap<>();
    	for(int i =0;i< nums.length; i++) {
    		if(!testSet.containsKey(nums[i]))
    			testSet.put(nums[i], i);
    		int diff = target - nums[i];
    		if(testSet.containsKey(diff) && testSet.get(diff) != i) {
    			result[0] = testSet.get(diff);
    			result[1] = i;
    		}
    		
    	}
    	
    	for(int num:result) {
    		System.out.println(num);
    	}
	}

}
