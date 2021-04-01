import java.util.*;
import java.io.*;

public class Mystack {
	private int top; //top����
	private String[] array; // �迭 ����
	private int size; //�迭�� ũ��

	
	public Mystack(int size) {
		this.size = size;
		this.top = -1; //-1�϶��� ����ִ� �����̴�.
		this.array = new String[size]; //size ���� ũ��� �迭 ����
	}
	
	public boolean empty() {//������ ������ ���� �Ǻ�
		return top == -1; //top�� 1�϶� �� ������ ��������� true ��� �� �� false ���
	}
	
	public String push(String item) {//������ �ֻ�ܿ� �����͸� �߰��ϴ� ����
		if(top == array.length -1) //������ �������ִ� ����
			throw new StackOverflowError("Stack Overflow Error");
		array[++top] = item; //top�� 1 ������Ų�Ŀ� item ����
		
		return item; //item �� ���� ���� ��µȴ�.
	}
	
	public String pop() { // ������ �ֻ�� �����͸� �����ϴ� ����
		String item = peek();
		array[top--] =null;
		return item; //�����ϴ� ���� ��ȯ
	}
	
	public String peek() {//������ �ֻ�� �����͸� Ȯ���ϴ� ����
		if(top == -1) //top�� -1 �� ���ÿ� �ƹ��� ���� ������  ������ ���
			throw new EmptyStackException(); //�̷� ������ �߻��ϰԵȴ�.
		return array[top];
	}
	
	public int search(Object o) {
		for(int i = top; i> -1; i--) {
			if(array[i].equals(o))
				return array.length - i;
		}
		return -1; // ���� ���ٸ� -1 ��ȯ
	}
	
	public static void main(String[] args) {
		Mystack st = new Mystack(5); //������ ���̸� 5�� ����
		
		st.push("��");
		System.out.println(st.array[0]);
		st.push("��");
		System.out.println(st.array[0]+st.array[1]);
		st.push("��");
		System.out.println(st.array[0]+st.array[1]+st.array[2]);
		
		System.out.println("\"��\"�� ��ġ�� :"+st.search("��"));
		System.out.println("\"��\"�� ��ġ�� :"+st.search("��"));
		System.out.println("\"��\"�� ��ġ�� :"+st.search("��"));
		
		System.out.println("���� �ֻ�ܰ��� : "+st.peek());
		System.out.println("�����ϴ� ���� : "+st.pop());
		System.out.println("���� �ֻ�ܰ��� : "+st.peek());
		
		System.out.println("���� ������ 0�ΰ�? : "+st.empty());
		System.out.println("�����ϴ� ���� : "+st.pop());
		System.out.println("�����ϴ� ���� : "+st.pop());
		System.out.println("���� ������ 0�ΰ�? : "+st.empty());
	}

}
