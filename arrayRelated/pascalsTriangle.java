package arrayRelated;

import java.util.ArrayList;
import java.util.List;

public class pascalsTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<List<Integer>> mylist = new ArrayList<List<Integer>>();
        
        int len = 10;
        
        for(int i=0;i<len;i++) {

        	List<Integer> temp = new ArrayList<Integer>();
        	
        	for(int j=0;j<=i;j++) {
        		if(j>0 &&j<=i-1) {
        			temp.add(mylist.get(i-1).get(j-1) + mylist.get(i-1).get(j));
        		}
        		else {
        			temp.add(1);
        		}
                       		
        	}	
        	mylist.add(temp);
        }
        
        System.out.println(mylist);
	}

}
