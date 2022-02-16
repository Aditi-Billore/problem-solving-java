package stringRelated;

import java.util.ArrayList;
import java.util.List;

public class WordLadder {

	public static List<String> nextWordinLadder(String word, List<String> wordList) {
		char[] wArray = word.toCharArray();
		System.out.println("Word is "+ word);
		List<String> list = new ArrayList<String>();
		for(String s: wordList) {
			int count =0;
			char[] sArray = s.toCharArray();
			for(int i=0;i< sArray.length; i++) {
				if(sArray[i] != wArray[i]) {
					count++;
				}
			}
			if(count ==1) {
				list.add(s);
			}
		}
		
		return list;
	}
	
	public static int ladderLength(String beginWord, String endWord, List<String> wordList) {
		int len = 1;
		if(!wordList.contains(endWord)) {
			return 0;
		}
		while(true) {
			List<String> list = nextWordinLadder(beginWord, wordList);
			if(list.contains(endWord)) {
				return len+1;
			}
			else {
				if(list.size() > 0) {
					len++;
					beginWord = list.get(0);	
					wordList.remove(beginWord);
				}
				else {
					return 0;
				}
				
			}
		}
	}

	public static void main(String[] args) {
		String beginWord = "hit", endWord = "cog";
		List<String> wordList = new ArrayList<String>();
		wordList.add("hot");
		wordList.add("dot");
		wordList.add("dog");
		wordList.add("lot");
		wordList.add("log");
			
		System.out.println(ladderLength(beginWord, endWord, wordList));
	}

}
