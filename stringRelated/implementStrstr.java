package stringRelated;

/*
 * Input: haystack = "hello", needle = "ll"
 * 
 * Output: 2
 */
public class implementStrstr {

	public static int strStr(String haystack, String needle) {
        if(haystack.equals(needle) || needle.length() == 0)
            return 0;
        else{
            for(int i = 0; i< haystack.length() ; i++){
                if(i + needle.length() > haystack.length()) 
                    return -1;
                String temp = haystack;
                temp = temp.substring(i, needle.length()+i);
                if(temp.equals(needle))
                    return i;
            }
        }
        return -1;
    }
	public static void main(String[] args) {
		System.out.println(strStr("hello", "ll"));
		System.out.println(strStr("aaaaa", "baa"));
		System.out.println(strStr("", ""));

	}

}
