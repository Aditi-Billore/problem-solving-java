package stringRelated;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FindAllAnagrams {
	
	//sliding window implementation
	public static List<Integer> findAnagram(String s, String p){
		 List<Integer> res = new ArrayList<>();
	        int lenS = s.length();
	        int lenP = p.length();
	        
	        if (lenP > lenS) {
	            return res;
	        }
	        
	        //left and right variables are used for making sliding window and when (right - left + 1 == lenP), 
			//then we will check if it is an anagram of String p.
	        int left = 0;
	        int right = 0;
	        //Initially counter is set equal to length of String p, when it will become zero, then we will know 
			//that the substring of s is an anagram of String p.
	        int counter = lenP;
	        
	        //Storing frequency of characters in String p in an array.
	        int[] freq = new int[26];
	        for (char ch : p.toCharArray()) {
	            freq[ch - 'a']++;
	        }
	        
	        while (right < lenS) {
	            char rch = s.charAt(right);
	            //If the character exists in freq array, then it can contribute in making anagram of String p, 
				//so decrease counter.
	            if (freq[rch - 'a'] > 0) {
	                counter--;
	            }
	            //Decrease the frequency of the character. 
	            freq[rch - 'a']--;
	            
	            //Length of substring in String s (right - left + 1), is equal to length of String p, so it may 
				//be an anagram.
	            if (right - left + 1 == lenP) {
	                //If counter is zero, meaning it is an anagram, then add left in result arraylist, where 
					//left is the start index.
	                if (counter == 0) {
	                    res.add(left);
	                }
	                
	                //Before moving left for checking further substrings, we will check if the frequency of the 
					//character it points is greater than or equal to zero (because, if the character's frequency 
					//was 2, then it would have become 1 or if it's frequency was 1, then it would have become 
					//zero). If it is, then increase the counter as we will have to find that character again in the 
					//new sliding window substring. 
	                char lch = s.charAt(left);
	                if (freq[lch - 'a'] >= 0) {
	                    counter++;
	                }
	                //Increase it's frequency as we had decreased it before and now we are leaving it behind.
	                freq[lch - 'a']++;
	                
	                //Now, move left.
	                left++;
	            }
	            
	            //Move right.
	            right++;
	        }
	        
	        return res;
	}
	
	
	public static List<Integer> findAnagrams(String s, String p) {
		if(p.length() > s.length()){
			return null;
		}
		List<Integer> anagram = new ArrayList<Integer>();
		if(s.equals(p))
		{
			anagram.add(0);
			return anagram;
		}
		for(int i =0;i<s.length()- p.length() +1; i++) {
			if(isValidAnagram(s.substring(i, i+p.length()), p)) {
				anagram.add(i);
			}
		}
		return anagram;
	}
	
	private static boolean isValidAnagram(String s, String p) {
		HashMap<Character, Integer> sMap = prepareMap(s);
		HashMap<Character, Integer> pMap = prepareMap(p);
		return sMap.equals(pMap);
	}
	
	private static HashMap<Character, Integer> prepareMap(String s){
		int count;
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for(int i =0;i<s.length();i++) {
			if(map.containsKey(s.charAt(i))) {
				count = map.get(s.charAt(i));
				map.put(s.charAt(i), count + 1);
			}
			else {
				map.put(s.charAt(i), 1);
			}
		}
		return map;
	}

	public static void main(String[] args) {
		String s = "cbaebabacd";
		String p = "abc";
		List<Integer> anagrams = findAnagram(s,p);
		for(int i : anagrams) {
			System.out.println(i);
		}
	}
}
