package arrayRelated;

/*
 * 
 * Given a 1-indexed array of integers numbers that is already 
 * sorted in non-decreasing order, find two numbers such that 
 * they add up to a specific target number. Let these two numbers 
 * be numbers[index1] and numbers[index2] where 1 <= index1 < index2 <= numbers.length.
 * 
 * Return the indices of the two numbers, index1 and index2, 
 * added by one as an integer array [index1, index2] of length 2.
 * 
 * The tests are generated such that there is exactly one solution. 
 * You may not use the same element twice.
 * 
 */
public class twoSumSorted {

	public static int[] twoSum(int[] numbers, int target) {
        
        int min = 0;
        int max = numbers.length - 1;
        while(min<max){
            int sum = numbers[min]+numbers[max];
            if( sum < target){
                min++;
            }
            else if(sum > target){
                max--;
            }
            else{
                return new int[]{ min +1, max+1 };
            }
        }      
        return new int[]{0,0};
    }
	
	public static void main(String[] args) {
		int[] numbers = {2,7,11,15};
		int[] result = twoSum(numbers, 9);
		
		for(int num: result) {
			System.out.println(num);
		}

	}

}
