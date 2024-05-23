package collection.list;

public class BatchProcessor {
	private final MyList<Integer> list;

	// MyList = MyArrayList
	// MyList = MyLinkedList
	public BatchProcessor(MyList<Integer> list) {
		this.list = list;
	}

	public void login(int size) {
		long startTime = System.currentTimeMillis();
		for (int i = 0; i < size; i++) {
			list.add(0, i); // 앞에 추가, ArrayList : O(n), LinkedList : O(1)
		}
		long endTime = System.currentTimeMillis();
		System.out.println("크기 : " + size + ", 계산 시간: " + (endTime - startTime) + "ms");
	}
}
