package arrayRelated;

public class RemoveDuplicatesSortedArray {
	public static int removeDuplicates(int[] nums) {
        if(nums.length < 3){
            return nums.length;
        }
        int prev1 = Integer.MIN_VALUE, prev2 = Integer.MIN_VALUE;
        int count = 0;
        for(int i =0; i< nums.length; i++) {
        	if(prev2 == nums[i]) {
        		for(int j =i;j < nums.length-1; j++) {
        			nums[j] = nums[j+1];
        		}
        		nums[nums.length-1] = Integer.MIN_VALUE;
        		i--;
    			System.out.println("Modifing array at i:  "+ i);
        		count++;
        	}
        	else {
        		if(prev1 == nums[i] && nums[i] != Integer.MIN_VALUE) {
        			prev2 = nums[i];
        			System.out.println("Setting prev2 to : "+ prev2 +" at i:  "+ i);
        		}
        		else {
        			prev1 = nums[i];
        			System.out.println("Setting prev1 to : "+ prev1 +" at i:  "+ i);
        		}
        	}
        }
        return nums.length - count;
    }
	
	public static int removeDuplicatesGeneric(int[] nums) {
		int len = nums.length;
		int rep = 2; //number of repetition allowed
		if(len < 3) {
			return len;
		}
		int count = rep;
		for(int i =count; i< len; i++) {
			if(nums[i - rep] != nums[i]) {
				nums[count++] = nums[i];
			}
		}		
		
		return count;
	}
	
	public static void main(String[] args) {
		int[] nums = {0,0,1,1,1,1,2,3,3};
		System.out.println(removeDuplicatesGeneric(nums));
	}
}
