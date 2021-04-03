
public class Union_Find {
	
	//자신을 부모와 연결시켜주는 재귀함수
	static int getParent(int[] parent, int x) {
		if(parent[x] == x) return x;
		return parent[x] = getParent(parent, parent[x]);
	}
	//각 부모노드를 합치는 함수
	static void unionParent(int[] parent, int a, int b) {
		a = getParent(parent,a);
		b = getParent(parent,b);
		if(a<b)parent[b] =a;
		else parent[a] = b;
	}
	
	//같은 부모를 가지는지 확인.
	static String findParent(int[] parent, int a, int b) {
		a = getParent(parent, a);
		b = getParent(parent, b);
		if(a==b) return "네";
		else return "아니오";
	}
	
	public static void main(String[] args) {
		int[] parent = new int[11];
		for(int i=1;i<=10;i++) {
			parent[i] = i; //처음에 만들어졌을 때 각자 자신을 가리키도록 연결
		}
		unionParent(parent, 1, 2); //각 노드를 합치는 과정
		unionParent(parent, 2, 3);
		unionParent(parent, 3, 4);
		unionParent(parent, 5, 6);
		unionParent(parent, 6, 7);
		unionParent(parent, 7, 8);
		System.out.println("1과 5는 연결되어있나요? : "+ findParent(parent, 1, 5));
	}

}
