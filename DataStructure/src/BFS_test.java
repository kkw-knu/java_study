import java.util.*;
public class BFS_test {
	
	public static boolean[] visited = new boolean[9];
	
	//BFS �Լ� ����
	public static void bfs(int[][] graph, int start) {
		Queue<Integer> q = new LinkedList<>();
		q.offer(start);//���� ��带 ť�� �ִ´�.
		visited[start] = true; //���� ��� �湮 ó��
		//ť�� �������� �ݺ�
		while(!q.isEmpty()) {
			//ť���� �ϳ��� ���Ҹ� �̾Ƽ� ����Ѵ�.
			int x = q.poll();
			System.out.print(x + " ");
			//�ش� ���ҿ� ����� ���� �湮���� ���ҵ��� ť�� �����Ѵ�.
			for(int i=0; i<graph[x].length;i++) {
				int y = graph[x][i];
				if(!visited[y]) { // �湮���� �ʾҴٸ� �湮
					q.offer(y);//ť�� ���� ����
					visited[y] =true; //�湮 �� �湮üũ
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
