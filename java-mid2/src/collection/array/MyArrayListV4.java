package collection.array;

import java.util.Arrays;

public class MyArrayListV4<E> {
	private static final int DEFAULT_CAPACITY = 5;

	private Object[] elementData;
	private int size = 0;

	public MyArrayListV4() {
		elementData = new Object[DEFAULT_CAPACITY];
	}

	public MyArrayListV4(int initialCapacity) {
		elementData = new Object[initialCapacity];
	}

	public int size() {
		return size;
	}

	public void add(E e) {
		// 코드 추가
		if (size == elementData.length) {
			grow();
		}
		elementData[size] = e;
		size++;
	}

	// 코드 추가
	private void grow() {
		int oldCapacity = elementData.length;
		int newCapacity = oldCapacity * 2;

		// 배열을 새로 만들고, 기존 배열을 새로운 배열에 복사
		elementData = Arrays.copyOf(elementData, newCapacity);
	}

	@SuppressWarnings("unchecked")
	public E get(int index) {
		return (E)elementData[index];
	}

	public E set(int index, E element) {
		E oldValue = get(index);
		elementData[index] = element;
		return oldValue;
	}

	public int indexOf(E o) {
		for (int i = 0; i < size; i++) {
			if (o.equals(elementData[i])) {
				return i;
			}
		}
		return -1;
	}

	public String toString() {
		return Arrays.toString(Arrays.copyOf(elementData, size))
			+ " size = " + size + ", capacity="
			+ elementData.length;
	}
}
