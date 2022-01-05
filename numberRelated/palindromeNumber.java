package numberRelated;

public class palindromeNumber {
	public static boolean isPalindrome(int x) {
        int num = x;
        int revNum = 0;
        
        while(num > 0){
            revNum = (revNum * 10) + (num % 10);
            num = num / 10;
        }
        if(revNum == x){
            return true;
        }
        return false;
    }
	
	public static void main(String[] args) {
		System.out.println(isPalindrome(121));
		System.out.println(isPalindrome(-121));
		System.out.println(isPalindrome(10));
	}
}
