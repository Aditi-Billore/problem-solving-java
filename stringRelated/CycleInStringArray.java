package stringRelated;

import java.util.ArrayList;

/*
 * Asked By Dropbox
 * Given a list of words, determine whether the words can 
 * be chained to form a circle. A word X can be placed in 
 * front of another word Y in a circle if the last character 
 * of X is same as the first character of Y.
 * 
 * For example, the words ['chair', 'height', 'racket', touch', 'tunic'] 
 * can form the following circle: 
 * chair --> racket --> touch --> height --> tunic --> chair.
 * 
 */
public class CycleInStringArray {

	
	public static boolean wordsCircle(String[] words) {
		ArrayList<String> wordList = new ArrayList<String>();
		
		for(String s: words) {
			wordList.add(s.toLowerCase());
		}
		int index = 0;
		while(wordList.size() >0) {
			String start = wordList.remove(index);
			if(wordList.size() != 0)
			{
				index = checkIfNextWordPresent(start, wordList);
			}
			else {
				char lastLetter = start.charAt(start.length() - 1);
				return words[0].toLowerCase().charAt(0) == lastLetter? true:false;			
			}
			if(index == -1) {
				return false;
			}
		}
		
		return true;
	}
	
	
	private static int checkIfNextWordPresent(String start, ArrayList<String> wordList) {
		
		char lastLetter = start.charAt(start.length() - 1);
		
		for(int i =0;i< wordList.size(); i++) {
			if(wordList.get(i).charAt(0) == lastLetter) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		String[] words = {"Chair", "Height", "Racket", "Touch", "tunic"};
		System.out.println(wordsCircle(words));
	}

}
