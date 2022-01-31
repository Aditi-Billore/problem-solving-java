package graphRelated;

import java.util.LinkedList;

public class TopologicalSort {

	static GraphAdj g;
	
	public static int findMinVertex(int[] indegree, boolean[] visited) {
		int min = Integer.MAX_VALUE, min_index = 0;
		for(int i =0;i<indegree.length; i++) {
			if(!visited[i] && indegree[i]<min) {
				min = indegree[i];
				min_index = i;
			}
		}
		return min_index;
	}
	
	public static void topoSort() {
		int[] inDegree = new int[g.getVertices()];
		LinkedList<Integer> list;
		boolean[] visited = new boolean[g.getVertices()];
		int count = 0;
		for(int i =0;i<g.getVertices(); i++) {
			inDegree[i] = 0;
			visited[i] = false;
		}
		
		for(int i =0;i<g.getVertices(); i++) {
			list = g.getAdjList(i);
			list.forEach(v ->{
				inDegree[v]++;
			});
		}
		
		while(count != g.getVertices()){
			int vertex = findMinVertex(inDegree, visited);
			visited[vertex] = true;
			count++;
			System.out.println(vertex + " ");
			list = g.getAdjList(vertex);
			list.forEach(v ->{
				inDegree[v]--;
			});
			
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		g = new GraphAdj(6);
		g.addEdge(5, 2);
        g.addEdge(5, 0);
        g.addEdge(4, 0);
        g.addEdge(4, 1);
        g.addEdge(2, 3);
        g.addEdge(3, 1);
 
        topoSort();
        
	}
}
