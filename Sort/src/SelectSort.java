import java.util.*;
import java.io.*;
public class SelectSort {
	public static void main(String[] args) {
		int[] array = {2,4,5,3,1,5,7,8,9};
		PrintArray(array);
		System.out.println("");
		SelectSort(array);
		PrintArray(array);
	}
	static void SelectSort(int[] array) {
		for(int a = 0; a<array.length; a++) {
			int min = a;
			for(int b = a+1; b<array.length;b++) {
				if(array[min] > array[b]) {
					min = b;
				}
			}
			int temp = array[a];
			array[a]=array[min];
			array[min]=temp;
		}
	}
	
	static void PrintArray(int[] array) {
		for(int a = 0; a<array.length; a++) {
			System.out.print(array[a]+" ");
		}
	}

}
