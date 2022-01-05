package stringRelated;

/*
 * Given a string s consisting of some words separated by some number of spaces, 
 * return the length of the last word in the string.
 * 
 * A word is a maximal substring consisting of non-space characters only.
 *
 * Input: s = "Hello World"
 * Output: 5 
 * Explanation: The last word is "World" with length 5.
 *
 */

public class lengthOfLastWord {

	public static void main(String[] args) {
		String s = "   fly me   to   the moon  ";
		s = s.trim();
		for(int i = s.length()-1; i>0;i--) {
			if(s.charAt(i) == ' ') {
				System.out.println(s.substring(i+1).length());
			}
		}
		
	}

}
