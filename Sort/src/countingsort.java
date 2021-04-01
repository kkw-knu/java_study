import java.util.*;
import java.io.*;
public class countingsort {
	public static void main(String[] args) {
		int[] array = {
				1,3,2,4,3,2,5,3,1,2,
				3,4,4,3,5,1,2,3,5,2,
				3,1,4,3,5,1,2,1,1,1
				};
		int[] count = new int[5];
		int temp;
		Arrays.fill(count, 0); //0으로 초기화하는부분, 자바는 자동으로 0으로 초기화하지만 이해를 위해 넣었다.
		for(int i = 0; i<30; i++) {
			count[array[i]-1]++;
		}
		for(int i = 0; i<5; i++) {
			if(count[i] !=0) {
				for(int j = 0; j<count[i]; j++) {
					System.out.print(i+1 + " ");
				}
			}
		}

	}

}
