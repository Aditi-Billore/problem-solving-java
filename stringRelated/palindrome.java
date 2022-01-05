package stringRelated;

public class palindrome {

	public static void main(String[] args) {
		String test = "abcdcba";
		Boolean check = false;
		for(int i = 0;i< test.length()/2; i++) {
			if(test.charAt(i)!= test.charAt(test.length()-1-i)) {
				System.out.println("Not a palindrome");
				check = true;
				break;
			}
		}
		if(!check)
			System.out.println("Palindrome");

	}

}
