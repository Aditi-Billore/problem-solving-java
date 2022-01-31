package graphRelated;

import java.util.LinkedList;

public class GraphAdj {
	private int vertices;
	private LinkedList<Integer> adj[];
	
	GraphAdj(int vertices){
		this.vertices = vertices;
		adj = new LinkedList [vertices];
		for(int i =0;i<vertices; i++) {
			adj[i] = new LinkedList();
		}
	}
	
	public void addEdge( int v, int u ) {
		adj[v].add(u);
	}
	
	public int getVertices() {
		return this.vertices;
	}
	
	public LinkedList<Integer> getAdjList(int v){
		return adj[v];
	}
	
}
