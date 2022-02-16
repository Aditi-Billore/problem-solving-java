package stringRelated;

import java.util.ArrayList;

public class LongestSubstring {

	public static int lengthOfLongestSubstring(String s) {
        if( s.length() == 0 ){
            return 0;
        }
        else if( s.length() == 1 ){
            return 1;
        }
        int start = 0;
        int max = 0;
        ArrayList<Character> charSet = new ArrayList<Character>();
        for(int i =0;i< s.length(); i++){
            System.out.println(charSet);
            
            if(charSet.contains(s.charAt(i))){ 
            	
            	while(s.charAt(start) != s.charAt(i)){
                    charSet.remove(charSet.get(0));//remove element from beginning	
                    start++;
                }
            	if(s.charAt(start) == s.charAt(i)) {
            		charSet.remove(charSet.get(0));//remove element from beginning	
                    start++;
            	}
                
                charSet.add(s.charAt(i));
            }
            else{
                charSet.add(s.charAt(i));
            }
            if(max < charSet.size() ){
                max = charSet.size();
            }
        }
        return max;
    }
	public static void main(String[] args) {
		String s = "aabaab!bb";
		
		System.out.println(lengthOfLongestSubstring(s));
	}
}
