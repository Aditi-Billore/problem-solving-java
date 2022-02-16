package stringRelated;

import java.util.HashMap;

public class PermutationsInString {
	public static boolean checkInclusion(String s1, String s2) {
		HashMap<Character, Integer> mapS1 = new HashMap<Character, Integer>();
		HashMap<Character, Integer> mapS2 = new HashMap<Character, Integer>();
		
		for(char s: s1.toCharArray()) {
			mapS1.put(s, mapS1.getOrDefault(s, 0)+1);
		}
		
		for(char s: s2.toCharArray()) {
			mapS2.put(s, mapS2.getOrDefault(s, 0)+1);
		}
		
		for(char s: mapS1.keySet()) {
			int charFreq = mapS1.get(s);
			if(!mapS2.containsKey(s) || mapS2.get(s) != charFreq) {
				return false;
			}
		}
		
		return true;
	}

	public static int[] frequency(String s) {
		int[] freq = new int[26];
		for(int i =0; i<s.length(); i++) {
			char temp = s.charAt(i);
			freq[temp - 'a']++;
		}
		return freq;
	}
	
	public static boolean isSame(int[] s1, int[] s2) {
		for(int i=0;i<26;i++) {
			if(s1[i] != s2[i]) {
				return false;
			}
		}
		return true;
	}
	
	public static boolean checkInclusion2(String s1, String s2) {
		int[] s1Freq = frequency(s1);
		for(int i =0;i< s2.length();i++) {
			int[] tempFreq = new int[26];
			
			if((i+s1.length())<= s2.length()) {
				tempFreq = frequency(s2.substring(i, i+s1.length()));
			}
			
			if(isSame(s1Freq, tempFreq))
				return true;
		}
		
		return false;
	}
	public static void main(String[] args) {
		String s1 = "ab";
		String s2 = "eidbaaoo";
		System.out.println(checkInclusion2(s1, s2));
	}

}
