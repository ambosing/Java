package collection.list;

public class BatchProcessorMain {
	public static void main(String[] args) {
		// MyArrayList<Integer> list = new MyArrayList<Integer>();
		MyLinkedList<Integer> list = new MyLinkedList<>();
		
		BatchProcessor processor = new BatchProcessor(list);
		processor.login(1_000_000);
	}
}
