package collection.link;

public class MyLinkedListV1 {
	private Node first;
	private int size = 0;

	public void add(Object e) {
		Node newNode = new Node(e);

		if (first == null) {
			first = newNode;
		} else {
			Node lastNode = getLastNode();
			lastNode.next = newNode;
		}
		size++;
	}

	public int indexOf(Object o) {
		int index = 0;
		for (Node x = first; x != null; x = x.next) {
			if (o.equals(x.item)) {
				return index;
			}
			index++;
		}
		return -1;
	}

	public int size() {
		return size;
	}

	public Object set(int index, Object element) {
		Node x = get(index);
		Object oldValue = x.item;
		x.item = element;
		return oldValue;
	}

	public Node get(int index) {
		Node x = first;
		for (int i = 0; i < index; i++) {
			x = x.next;
		}

		return x;
	}

	private Node getLastNode() {
		Node x = first;
		while (x.next != null) {
			x = x.next;
		}
		return x;
	}

	@Override
	public String toString() {
		return "MyLinkedListV1{" +
			"first=" + first +
			", size=" + size +
			'}';
	}
}
