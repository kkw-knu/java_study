import java.util.*;
public class DFS_test {
	
	public static boolean[] visited = new boolean[9]; 
	//�湮ó���� ���� �迭
	
	//dfs�Լ� ����
	public static void dfs(int[][] graph, int x) {
		//���� ��带 �湮 ó��
		visited[x] = true;
		System.out.print(x + " ");
		//������� ����� �ٸ� ��带 ��������� �湮
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
