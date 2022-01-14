package arrayRelated;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThirdMax {

    public static int thirdMax(int[] nums) {
	        
        Arrays.sort(nums);
        List<Integer> list = new ArrayList<Integer>();
        
        for(int num:nums){
            if(!list.contains(num)) {
            	list.add(num);
            }
        }
        
        if(list.size() >3){
            return list.get(list.size()-3);
        }
        else{
            return list.get(list.size()-1);
        }
	}
	
	public static void main(String[] args) {
		int[] nums = {2,3,4,1,6,8,7};
		System.out.println(thirdMax(nums));

	}

}
