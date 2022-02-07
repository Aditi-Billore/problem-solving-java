package arrayRelated;

import java.util.ArrayList;
import java.util.List;

public class MergeIntervals {

	public static int[][] merge(int[][] intervals) {
		int min, max, current;
		List<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		if(intervals.length < 2) {
			return intervals;
		}
		min = intervals[0][0];
		max = intervals[0][1];
		for(int i = 1; i< intervals.length ; i++) {
			if(max >= intervals[i][0] || min <= intervals[i][0]) {
				if(max >= intervals[i][0])
					max = intervals[i][1];
				if(min <= intervals[i][0])
					min = intervals[i][0];					
			}
			else {
				ArrayList<Integer> list = new ArrayList<Integer>();
				list.add(intervals[i][0]);
				list.add(intervals[i][1]);
				result.add(list);
			}	
		}
		//add min max in array
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(min);
		list.add(max);
		result.add(list);
		
		int[][] nums = new int[result.size()][];
		for(int i=0;i<result.size(); i++) {
			nums[i] = new int[2];
			nums[i][0] = result.get(i).get(0);
			nums[i][1] = result.get(i).get(1);
		}
	    return nums;
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
