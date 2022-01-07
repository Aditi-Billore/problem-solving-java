package stringRelated;

/*
 * A phrase is a palindrome if, after converting all uppercase letters 
 * into lowercase letters and removing all non-alphanumeric characters, 
 * it reads the same forward and backward. Alphanumeric characters include letters and numbers.
 * 
 * Given a string s, return true if it is a palindrome, or false otherwise.
 */
public class validPalindrome {

	public static boolean isPalindrome(String s) {
		String temp = "";
		for(int i=0;i<s.length();i++) {
			if( Character.isLetterOrDigit(s.charAt(i))) {
				temp += Character.toLowerCase( s.charAt(i) );
			}
		}
		
		
		for(int i = 0;i<temp.length()/2; i++) {
			if(temp.charAt(i) != temp.charAt(temp.length()-i-1)) {
				return false;
			}
		}
		
		return true;		
    }
	
	public static void main(String[] args) {
		String check= "A man, a plan, a canal: Panama";
		
		System.out.println(isPalindrome(check)); 
	}

}
