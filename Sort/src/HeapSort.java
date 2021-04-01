import java.util.*;
import java.io.*;
public class HeapSort {
	public static void main(String[] args) {
		int[] array = {5,2,17,1,6,4,8,3,7,9,15};
		heapsort(array,array.length);
		PrintArray(array);
	}
	
	static void heapsort(int[] heap,int length) {
		if(length==0) return;
		//ó�� ���� ����� ����
		for(int i = 1; i<length; i++) {
			int child = i;
			do {
				int parent = (child-1)/2;
				if(heap[parent] < heap[child]) { //�ڽ��� �θ𺸴� ũ�� ��ġ �ٲ�
					int temp = heap[child];
					heap[child] = heap[parent];
					heap[parent] = temp;
				}
				child = parent;
			}while (child != 0);
		}
		int temp = heap[0]; //�ֻ���� ���� �迭 �� ���� �ٲ��ִ� �����̴�.
		heap[0] = heap[length-1];
		heap[length-1] = temp;
		heapsort(heap,length-1);
	}
	
	static void PrintArray(int[] array) {
		for(int i = 0; i<array.length;i++) {
			System.out.print(array[i]+" ");
		}
	}
}
