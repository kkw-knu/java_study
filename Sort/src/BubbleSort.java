
public class BubbleSort {

	public static void main(String[] args) {
		int[] array = {1,5,2,3,9,9,4,8,7,6};
		bubblesort(array);
		ArrayPrint(array);
	}
	static void bubblesort(int[] array) {
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array.length-1;j++) {
				if(array[j]>array[j+1]) {
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
	}
	
	static void ArrayPrint(int[] array) {
		for(int i=0; i<array.length;i++) {
			System.out.print(array[i]+" ");
		}
	}

}
