package arrayRelated;

public class WordWrap {

	public static int solveWordWrap (int[] nums, int k)
    {
		int tempWidth = 0, tempSpace = 0, leftSum = 0, rightSum = 0;		
		
		for(int i =0;i< nums.length;i++) {
			tempWidth = nums[i];
			
			while(tempWidth<=k && i< nums.length - 1) {
				i++;
				tempWidth += 1 + nums[i];
				if(tempWidth > k) {
					tempWidth -= 1 + nums[i];
					i--;
					break;
				}
				else {
//					tempSpace += 1;
				}
			}
			if(i != nums.length -1 )
				tempSpace += (k-tempWidth);
			leftSum += (tempSpace * tempSpace);
			tempWidth = 0;
			tempSpace = 0;
		}
		
		for(int i =nums.length - 1;i>= 0;i--) {
			tempWidth = nums[i];
			
			while(tempWidth<=k && i > 0) {
				i--;
				tempWidth += 1 + nums[i];
				if(tempWidth > k) {
					tempWidth -= 1 + nums[i];
					i++;
					break;
				}
				else {
//					tempSpace += 1;
				}
			}
			if(i != nums.length - 1)
				tempSpace += (k-tempWidth);
			rightSum += (tempSpace * tempSpace);
			tempWidth = 0;
			tempSpace = 0;
		}
		
		return Math.min(leftSum, rightSum);
    }
	public static void main(String[] args) {
//		int[] nums = {3,2,2,5};
//		int k = 6;
		int[] nums = {10, 6, 5, 3, 1, 10,8,2};
		int k = 12;
		
		System.out.println(solveWordWrap(nums, k));
		
	}
}
