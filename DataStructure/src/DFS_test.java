import java.util.*;
public class DFS_test {
	
	public static boolean[] visited = new boolean[9]; 
	//방문처리를 위한 배열
	
	//dfs함수 정의
	public static void dfs(int[][] graph, int x) {
		//현재 노드를 방문 처리
		visited[x] = true;
		System.out.print(x + " ");
		//현재노드와 연결된 다른 노드를 재귀적으로 방문
		for(int i=0; i<graph[x].length;i++) {
			int y = graph[x][i];
			if(!visited[y]) dfs(graph, y);
		}
	}
	
	public static void main(String[] args) {
		int[][] graph = {
				{},
				{2,4,6},
				{1},
				{4},
				{1, 3, 5},
				{4, 6, 7},
				{1, 5},
				{5}
		};
		dfs(graph, 1);
	}

}
