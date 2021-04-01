import java.util.*;
import java.io.*;

public class Mystack {
	private int top; //top생성
	private String[] array; // 배열 생성
	private int size; //배열의 크기

	
	public Mystack(int size) {
		this.size = size;
		this.top = -1; //-1일때가 비어있는 상태이다.
		this.array = new String[size]; //size 선언 크기로 배열 생성
	}
	
	public boolean empty() {//스택의 데이터 유무 판별
		return top == -1; //top가 1일때 즉 스택이 비어있을때 true 출력 그 외 false 출력
	}
	
	public String push(String item) {//스택의 최상단에 데이터를 추가하는 과정
		if(top == array.length -1) //스택이 가득차있는 상태
			throw new StackOverflowError("Stack Overflow Error");
		array[++top] = item; //top을 1 증가시킨후에 item 넣음
		
		return item; //item 즉 넣은 값이 출력된다.
	}
	
	public String pop() { // 스택의 최상단 데이터를 제거하는 과정
		String item = peek();
		array[top--] =null;
		return item; //제거하는 값을 반환
	}
	
	public String peek() {//스택의 최상단 데이터를 확인하는 과정
		if(top == -1) //top이 -1 즉 스택에 아무런 값이 없으면  읽으수 없어서
			throw new EmptyStackException(); //이런 에러가 발생하게된다.
		return array[top];
	}
	
	public int search(Object o) {
		for(int i = top; i> -1; i--) {
			if(array[i].equals(o))
				return array.length - i;
		}
		return -1; // 값이 없다면 -1 반환
	}
	
	public static void main(String[] args) {
		Mystack st = new Mystack(5); //스택의 길이를 5로 설정
		
		st.push("가");
		System.out.println(st.array[0]);
		st.push("나");
		System.out.println(st.array[0]+st.array[1]);
		st.push("다");
		System.out.println(st.array[0]+st.array[1]+st.array[2]);
		
		System.out.println("\"가\"의 위치는 :"+st.search("가"));
		System.out.println("\"다\"의 위치는 :"+st.search("다"));
		System.out.println("\"마\"의 위치는 :"+st.search("마"));
		
		System.out.println("현재 최상단값은 : "+st.peek());
		System.out.println("제거하는 값은 : "+st.pop());
		System.out.println("현재 최상단값은 : "+st.peek());
		
		System.out.println("현재 스택이 0인가? : "+st.empty());
		System.out.println("제거하는 값은 : "+st.pop());
		System.out.println("제거하는 값은 : "+st.pop());
		System.out.println("현재 스택이 0인가? : "+st.empty());
	}

}
