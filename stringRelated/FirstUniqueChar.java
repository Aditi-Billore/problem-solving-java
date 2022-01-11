package stringRelated;

/*
 * 
 * Given a string s, find the first non-repeating 
 * character in it and return its index. 
 * If it does not exist, return -1.
 * 
 */

public class FirstUniqueChar {
	public static int firstUniqChar(String s) {
        for(int i =0;i< s.length(); i++)
        {
        	char ch = s.charAt(i);
        	if(s.indexOf(ch) == s.lastIndexOf(ch)) {
        		return i; 
        	}
        }
		return -1;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(firstUniqChar("hello"));
		
	}

}
