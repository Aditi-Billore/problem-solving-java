package arrayRelated;

public class MoveZeros {
	public static void moveZeroes(int[] nums) {
        int[] temp = new int[nums.length];
        int count = 0;
        for(int x:nums){
            if( x != 0 ){
                temp[count++] = x;   
            }
        }
        for(int i =0; i< temp.length; i++){
            nums[i] = temp[i];
        }
        
        for(int j = temp.length; j< nums.length; j++)
            nums[j] = 0;
    }
	
	public static void moveZeroesInPlace(int[] nums) {
		int count = 0;
		for(int num:nums) {
			if(num != 0)
				nums[count++] = num;
		}
		while(count < nums.length) {
			nums[count++] = 0;
		}
	}    
	public static void main(String[] args) {
		int[] nums = {0,1,0,3,12};
		moveZeroesInPlace(nums);
		for(int n: nums)
			System.out.println(n);
	}
}
