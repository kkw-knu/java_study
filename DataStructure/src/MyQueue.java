import java.util.LinkedList;
import java.util.Queue;
public class MyQueue {

	public static void main(String[] args) {
		Queue<String> q = new LinkedList<>();
		q.offer("°¡");
		q.offer("³ª");
		System.out.println(q.peek());
		q.poll();
		System.out.println(q.peek());
		q.poll();
		System.out.println(q.peek());
		System.out.println(q.isEmpty());
	}
}


