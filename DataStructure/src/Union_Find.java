
public class Union_Find {
	
	//�ڽ��� �θ�� ��������ִ� ����Լ�
	static int getParent(int[] parent, int x) {
		if(parent[x] == x) return x;
		return parent[x] = getParent(parent, parent[x]);
	}
	//�� �θ��带 ��ġ�� �Լ�
	static void unionParent(int[] parent, int a, int b) {
		a = getParent(parent,a);
		b = getParent(parent,b);
		if(a<b)parent[b] =a;
		else parent[a] = b;
	}
	
	//���� �θ� �������� Ȯ��.
	static String findParent(int[] parent, int a, int b) {
		a = getParent(parent, a);
		b = getParent(parent, b);
		if(a==b) return "��";
		else return "�ƴϿ�";
	}
	
	public static void main(String[] args) {
		int[] parent = new int[11];
		for(int i=1;i<=10;i++) {
			parent[i] = i; //ó���� ��������� �� ���� �ڽ��� ����Ű���� ����
		}
		unionParent(parent, 1, 2); //�� ��带 ��ġ�� ����
		unionParent(parent, 2, 3);
		unionParent(parent, 3, 4);
		unionParent(parent, 5, 6);
		unionParent(parent, 6, 7);
		unionParent(parent, 7, 8);
		System.out.println("1�� 5�� ����Ǿ��ֳ���? : "+ findParent(parent, 1, 5));
	}

}