package graphRelated;

import java.util.LinkedList;

public class DFS {

	static GraphAdj g;
	
	public static void dfsUtil(int vertex, boolean[] visited) {
		visited[vertex] = true;
		System.out.print( vertex + " ");
		
		LinkedList<Integer> list = g.getAdjList(vertex);
		
		list.forEach(v -> {
			if(!visited[v]) {
				dfsUtil(v, visited);
			}
		});
	}
	
	public static void dfs( int start ) {
		boolean visited[] = new boolean[g.getVertices()];
		
		for(int i =0;i< g.getVertices(); i++) {
			if(visited[i] != true)
				dfsUtil(i, visited);
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		g = new GraphAdj(4);
		g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);
 
        
        dfs(2);
        
	}

}
