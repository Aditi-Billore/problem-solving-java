package arrayRelated;

/*
 * Input: digits = [1,2,3]
 * Output: [1,2,4]
 * Explanation: The array represents the integer 123.
 * Incrementing by one gives 123 + 1 = 124.
 * Thus, the result should be [1,2,4].
 */

public class plusOne {

	public static int[] plusOneMethod(int[] digits) {
        int lastDigit = digits[ digits.length -1 ];
        int[] digitsNew = new int[ digits.length + 1];
        
        if( lastDigit < 9 )
        {
            digits[ digits.length -1 ] = lastDigit + 1;
            return digits;
        }    
        else{
            int breakFlag = 0;
            for(int i = digits.length -1; i>=0; i-- ){
                if( digits[i] == 9 ){
                    digits[i] = 0;
                }       
                else if( digits[i] < 9 ){
                    breakFlag = 1;
                    digits[i] = digits[i] + 1;
                    return digits;
                }
            }
            if(breakFlag == 0){
                int count = 0;
                digitsNew[count++] = 1;
                for(int x: digits){
                    digitsNew[count++] = x;
                }
            }
        }  
        return digitsNew;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] digits = {1,2,3,9};
		int[] result = plusOneMethod(digits);
		for(int num: result) {
			System.out.println(num);
		}
	}

}
