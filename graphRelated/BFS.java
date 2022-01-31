package graphRelated;

import java.util.LinkedList;

public class BFS {

	static GraphAdj g;
	public static void bfs( int start ) {
		boolean visited[] = new boolean[g.getVertices()];
		LinkedList<Integer> queue = new LinkedList<Integer>();
		
//		marking current node visted and adding in queue
		
		visited[start] = true;
		queue.add(start);
		
		while(queue.size() != 0) {
			start = queue.poll();
			System.out.print( start + " ");
			
			LinkedList<Integer> list= g.getAdjList(start);
			
			list.forEach(v -> {
				if(!visited[v]) {
					visited[v] = true;
					queue.add(v);
				}
			});
			
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
        
        bfs(2);
        
	}

}
