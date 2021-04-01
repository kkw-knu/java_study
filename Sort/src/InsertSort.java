
public class InsertSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {5,1,4,2,8,9,6,3,7};
		insertsort(array);
		PrintArray(array);
	}
	
	static void insertsort(int[] array) {
		for(int i = 1; i<array.length;i++) {
			int j = i - 1; //비교하는 대상
			int temp = array[i]; //비교하는 값
			while(j>=0 && temp<array[j]) {
				array[j+1]=array[j];
				j--;
			}
			array[j+1] = temp;
		}
	}
	
	static void PrintArray(int[] array) {
		for(int a = 0 ; a< array.length; a++) {
			System.out.print(array[a]+" ");
		}
	}

}
