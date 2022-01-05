package stringRelated;

import java.util.HashMap;
import java.util.Map;

/*
 * Given two binary strings a and b, return their sum as a binary string.
 * Input: a = "11", b = "1"
 * 
 * Output: "100"
 */
public class addBinary {

	/*
	 * rules:
	 * 0 + 0 = 0 and carry = 0
	 * 1 + 1 = 0 and carry = 1
	 * 0 + 1 = 1 and carry = 0
	 * 1 + 0 = 1 and carry = 0
	 */
	public static String addBinaryMethod(String a, String b) {
		int indexA = a.length()-1;
		int indexB = b.length()-1;
		String c = "";
		int carry = 0;
		while(indexA >= 0 && indexB >= 0) {
			if(a.charAt(indexA) == '0') {
				if(b.charAt(indexB) == '0') {
					if(carry == 1) {
						c += '1';
						carry = 0;
					}						
					else {
						c += '0';
						carry = 0;
					}
				}
				else {
					if(carry == 1) {
						c += '0';
						carry = 1;
					}						
					else {
						c += '1';
						carry = 0;
					}
				}
			}
			else { //if first number is 1
				if(b.charAt(indexB) == '0') {
					if(carry == 1) {
						c += '0';
						carry = 1;
					}						
					else {
						c += '1';
						carry = 0;
					}
				}
				else {
					if(carry == 1) {
						c += '1';
						carry = 1;
					}						
					else {
						c += '0';
						carry = 1;
					}
				}
			}
			indexA--;
			indexB--;
		}
		while(indexA>=0) {
			if(carry == 1) {
				if(a.charAt(indexA)=='1') {
					c += '0';
					carry = 1;
				}
				else {
					c += '1';
					carry = 0;
				}
			}
			else {
				c += a.charAt(indexA);
			}
			indexA--;
		}
		while(indexB>=0) {
			if(carry == 1) {
				if(b.charAt(indexB)=='1') {
					c += '0';
					carry = 1;
				}
				else {
					c += '1';
					carry = 0;
				}
			}
			else {
				c += b.charAt(indexB);
			}
			indexB--;
		}
		if(carry == 1) {
			c += '1';
		}
		return (new StringBuilder(c)).reverse().toString();
    }
	
	public static void main(String[] args) {
		HashMap<String, String> testString = new HashMap<String, String>();
		testString.put("101", "10"); //111
		testString.put("11", "1"); //100
		testString.put("1010", "1011"); //10101
		
		for(Map.Entry<String,String> mapEle: testString.entrySet()) {
			System.out.println(mapEle.getKey() +"======"+ mapEle.getValue());
			System.out.println(addBinaryMethod(mapEle.getKey(), mapEle.getValue()));
		}
//		System.out.println(a.charAt(0) + b.charAt(0));
	}
	
}
