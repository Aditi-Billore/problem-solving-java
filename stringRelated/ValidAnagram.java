package stringRelated;

import java.util.Arrays;

public class ValidAnagram {

	public static boolean isAnagram(String s, String t) {
        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();
        Arrays.sort(sArray);
        Arrays.sort(tArray);
        
        return Arrays.equals(sArray,tArray);
    }
	public static void main(String[] args) {
		String s = "anagram", t = "nagaram";
		
		System.out.println(isAnagram(s,t));

	}

}
