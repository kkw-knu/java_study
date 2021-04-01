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
		if(start >=end) { //원소가 한개일 떄
			return;
		}
		int pivot = start; // 피벗값, 첫번째 원소
		int i = start + 1; //큰 키값을 찾을 인덱스
		int j = end; //작은 키값을 찾을 인덱스
		int temp; //값을 바꿀 임시변수
		
		while(i <=j) { // 엇갈릴 때 즉 큰 키값을 찾을 인덱스하고 작은 키값을 찾을 인덱스가 서로 엇갈렸을 때
			while(array[i] <= array[pivot] && i <= end) {//키값보다 큰 값을 찾을 때 까지 반복
				i++;
			}
			while(array[j] >= array[pivot] && j > start) {//키값보다 작은 값을 찾을 때 까지 반복
				j--;
			}
			if(i > j) { //현재 엇갈린 상태라면 키 값과 교체
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
//퀵정렬 재귀함수 사용하기