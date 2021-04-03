import java.util.*;
public class BFS_test {
	
	public static boolean[] visited = new boolean[9];
	
	//BFS 함수 정의
	public static void bfs(int[][] graph, int start) {
		Queue<Integer> q = new LinkedList<>();
		q.offer(start);//시작 노드를 큐에 넣는다.
		visited[start] = true; //현재 노드 방문 처리
		//큐가 빌때까지 반복
		while(!q.isEmpty()) {
			//큐에서 하나의 원소를 뽑아서 출력한다.
			int x = q.poll();
			System.out.print(x + " ");
			//해당 원소와 연결된 아직 방문안한 원소들을 큐에 삽입한다.
			for(int i=0; i<graph[x].length;i++) {
				int y = graph[x][i];
				if(!visited[y]) { // 방문하지 않았다면 방문
					q.offer(y);//큐에 값을 넣음
					visited[y] =true; //방문 후 방문체크
				}
			}
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
		bfs(graph, 1);
	}

}
