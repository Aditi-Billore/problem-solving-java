package arrayRelated;

import java.util.HashMap;

public class SubarraySumEqualsK {

	public static int subarraySumArray(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        map.put(0, 1); //sum and frequency of that sum
        int sum = 0, count = 0;
        for(int i=0;i< nums.length; i++) {
        	sum += nums[i];
        	
        	if(map.containsKey(sum - k)) {
        		count += map.get(sum - k);
        	}
        	map.put(sum, map.getOrDefault(sum, 0)+ 1);
        }  
        
        return count;
    }
	public int subarraySum(int[] nums, int k) {
        int first = 0;
        int last = 0;
        int currentSum = 0;
        int result = 0;
        while(first < nums.length){
            if(last< nums.length)
                currentSum += nums[last++];
            else
                break;    
            
            if(currentSum == k){
                result++;
                first++;
                last = first;
                currentSum= 0;
            }
            if(currentSum > k){                
                first++;
                last = first;
                currentSum= 0;
            }
        }
        return result;
    }
	public static void main(String[] args) {
		int[] nums = {1,2,3};
		int k = 3;
		System.out.println(subarraySumArray(nums, k));

	}

}
