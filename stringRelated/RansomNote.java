package stringRelated;

import java.util.Arrays;

/*
 * check whether ransom string can be created
 * from string gven in magazine
 * 
 */
public class RansomNote {

	public static boolean canConstruct(String ransomNote, String magazine) {
        char[] ransom = ransomNote.toCharArray();
        char[] mag = magazine.toCharArray();
        int magIndex = 0, ransomIndex =0;
        Arrays.sort(ransom);
        Arrays.sort(mag);
        while(magIndex<mag.length && ransomIndex<ransom.length){
        	if(ransom[ransomIndex] == mag[magIndex]) {
        		magIndex++;
        		ransomIndex++;
        	}
        	else {
        		magIndex++;
        	}
        }
		return ransomIndex== ransomNote.length();
    }

	public static void main(String[] args) {
		String magazine = "Hello";
		String ransomNote = "elplo";
		System.out.println(canConstruct(ransomNote, magazine));
		
	}

}
