package collection.deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeMain {
	public static void main(String[] args) {
		Deque<Object> deque = new ArrayDeque<>();

		// 데이터 추가
		deque.offerFirst(1);
		System.out.println(deque);
		deque.offerFirst(2);
		System.out.println(deque);

		// 다음 꺼낼 데이터 확인(꺼내지 않고 단순 조회만)
		System.out.println("deque.peekFirst() = " + deque.peekFirst());
		System.out.println("deque.peekFirst() = " + deque.peekFirst());
		System.out.println("deque.pollLast() = " + deque.pollLast());
		System.out.println("deque.pollLast() = " + deque.pollLast());
		System.out.println(deque);
	}
}
