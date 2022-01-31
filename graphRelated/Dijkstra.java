package graphRelated;

public class Dijkstra {

	public static int findMinVertex(boolean[] visited, int[] distance) {
		int min_vertex = -1;
		for(int i =0;i< distance.length; i++) {
			if(!visited[i] && (min_vertex == -1 || distance[i]<distance[min_vertex]) ) {
				min_vertex = i;
			}
		}
		return min_vertex;
	}
	public static void dijkstra(int[][] graph, int start) {
		int v = graph.length;
		boolean[] visited = new boolean[v];
		int[] distance = new int[v];
		distance[start] = 0;
		
		for(int i=1;i<v;i++) {
			distance[i] = Integer.MAX_VALUE;
		}
		
		for(int i=0;i< v-1;i++) {
//			find min vertex : vertex with minimum distance
			int minVertex = findMinVertex(visited, distance);
			visited[minVertex] = true;
//			explore neigbors and update distance if needed
			for(int j=0;j< v;j++) {
				if(graph[minVertex][j] != 0 && !visited[j] & distance[minVertex] != Integer.MAX_VALUE ) {
					
					int newDist = distance[minVertex] + graph[minVertex][j];
					if(distance[j]>newDist) {
						distance[j] = newDist;
					}	
				}
				
			}
		}
		
		for(int i =0;i<v;i++) {
			System.out.println(i + "   " + distance[i]);
		}
		
		
	}
	
	public static void main(String[] args) {
		int graph[][] = new int[][] { 
				{ 0, 4, 0, 0, 0, 0, 0, 8, 0 }, 
				{ 4, 0, 8, 0, 0, 0, 0, 11, 0 },
				{ 0, 8, 0, 7, 0, 4, 0, 0, 2 }, 
				{ 0, 0, 7, 0, 9, 14, 0, 0, 0 }, 
				{ 0, 0, 0, 9, 0, 10, 0, 0, 0 },
				{ 0, 0, 4, 14, 10, 0, 2, 0, 0 }, 
				{ 0, 0, 0, 0, 0, 2, 0, 1, 6 }, 
				{ 8, 11, 0, 0, 0, 0, 1, 0, 7 },
				{ 0, 0, 2, 0, 0, 0, 6, 7, 0 } };
		dijkstra(graph, 0);

	}
}
