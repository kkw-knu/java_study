import java.io.*;
import java.util.*;
public class QuickSort {
	public static void main(String[] args) {
		int[] array = {5,2,1,6,4,8,3,7,9};
		PrintArray(array);
		QuickSort(array, 0, array.length-1);
		PrintArray(array);
	}
	public static void QuickSort(int[] array, int start, int end) {
		if(start >=end) { //���Ұ� �Ѱ��� ��
			return;
		}
		int pivot = start; // �ǹ���, ù��° ����
		int i = start + 1; //ū Ű���� ã�� �ε���
		int j = end; //���� Ű���� ã�� �ε���
		int temp; //���� �ٲ� �ӽú���
		
		while(i <=j) { // ������ �� �� ū Ű���� ã�� �ε����ϰ� ���� Ű���� ã�� �ε����� ���� �������� ��
			while(array[i] <= array[pivot] && i <= end) {//Ű������ ū ���� ã�� �� ���� �ݺ�
				i++;
			}
			while(array[j] >= array[pivot] && j > start) {//Ű������ ���� ���� ã�� �� ���� �ݺ�
				j--;
			}
			if(i > j) { //���� ������ ���¶�� Ű ���� ��ü
				temp = array[j];
				array[j] = array[pivot];
				array[pivot] = temp;
			}
			else {
				temp = array[j];
				array[j] = array[i];
				array[i] = temp;
			}
		}
		QuickSort(array,start, j-1);
		QuickSort(array,j+1, end);
	}
	public static void PrintArray(int[] array) {
		for(int a = 0; a<array.length; a++) {
			System.out.print(array[a]+" ");
		}
		System.out.println("");
	}

}
//������ ����Լ� ����ϱ�