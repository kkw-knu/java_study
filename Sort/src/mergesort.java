import java.util.*;
public class mergesort {
	public static void main(String[] args) {
		int[] array = {6,5,4,2,8,3,1,7,9};
		mergesort(array,0,array.length-1);
		printArray(array);
	}
	
	static void printArray(int[] array) { //배열을 프린트해주는 함수
		for(int a = 0; a < array.length; a++) {
			System.out.print(array[a]+" ");
		}
	}
	
	static void mergesort(int[] array, int start, int end) {//재귀함수
		if(start<end) {
			int mid = (start + end)/2;
			mergesort(array,start,mid);
			mergesort(array,mid+1,end);
			merge(array,start,mid,end);
		}
	}
	
	static void merge(int[] array, int start, int mid, int end){
		int[] temp = new int[array.length];
		int i = start;
		int k = start;
		int j = mid + 1;
		while(i<=mid && j<=end) {
			if(array[i] < array[j]) {
				temp[k] = array[i];
				i++;
			}
			else {
				temp[k] = array[j];
				j++;
			}
			k++;
			
		}
		if(i>mid) {
			for(int a=j; a<=end;a++,k++) {
				temp[k] = array[a];
			}
		}
		else {
			for(int a=i; a<=mid;a++,k++) {
				temp[k] = array[a];
			}
		}
		for(int a = start; a<=end; a++) {
			array[a] = temp[a];	
		}
	}
	
}