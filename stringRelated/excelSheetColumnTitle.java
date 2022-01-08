package stringRelated;

public class excelSheetColumnTitle {

	public static String convertToTitle(int columnNumber) {
        String result = "";
        while(columnNumber >0){
            char ch = (char) ('A' + ((columnNumber - 1) % 26));
            columnNumber /= 26;
            result+= ch;
        }
        return new StringBuilder(result).reverse().toString();
    }
	
	public static int convertTitleToNum(String columnName) {
        int sum =0, count = 0;
        
        for(int i =columnName.length()-1;i>=0;i--) {
        	sum +=  (int)(columnName.charAt(i)) * Math.pow(26, count);
        	count++;
        }
		return sum;
    }
	
	public static void main(String[] args) {
		int nums = 28;
		String num = convertToTitle(nums);
		System.out.println(num);
		System.out.println(convertTitleToNum(num));

	}

}
