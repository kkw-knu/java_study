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
		Arrays.fill(count, 0); //0���� �ʱ�ȭ�ϴºκ�, �ڹٴ� �ڵ����� 0���� �ʱ�ȭ������ ���ظ� ���� �־���.
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
