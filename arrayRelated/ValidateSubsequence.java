package arrayRelated;

//array = {5,1,22,25,6,-1, 8,10};
//sequence = {1,6,-1,10};
//validate if sequence exists in array, no need to be together one after another

public class ValidateSubsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {5,1,22,25,6,-1, 8,10};
		int[] sequence = {1,6,-1,10};
		
		int seqCounter = 0;
		for(int i = 0; i< arr.length; i++) {
			if(seqCounter< sequence.length && sequence[seqCounter] == arr[i]) {
				seqCounter++;
			}
		}
		if(seqCounter == sequence.length)
			System.out.println("Valid");
		else
			System.out.println("Invalid");
	}

}
