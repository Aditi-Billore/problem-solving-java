package arrayRelated;

public class MergeIntervals {

	public static int[][] merge(int[][] intervals) {
		int min, max, current;
		
		for(int i = 0; i< intervals.length ; i++) {
			
			min = intervals[i][0];
			max = intervals[i][1];
			
			
		}
		
	    return null;
    }
	public static void main(String[] args) {
		int[][] intervals = {{1,3},{2,6},{8,10},{15,18}};
		int[][] result = merge(intervals);
		for(int i=0; i< result.length; i++) {
			for(int j=0; j< result[0].length; j++) {
				System.out.print(result[i][j] + " ");
			}
			System.out.println(" ");
		}
	}
}
