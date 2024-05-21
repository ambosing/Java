package collection.link;

public class MyLinkedListV3Main {
	public static void main(String[] args) {
		MyLinkedListV3<String> list = new MyLinkedListV3<>();
		list.add("a");
		list.add("b");
		list.add("c");
		String string = list.get(0);
		System.out.println("string = " + string);

		MyLinkedListV3<Integer> intList = new MyLinkedListV3<>();
		intList.add(1);
		intList.add(2);
		intList.add(3);
		Integer integer = intList.get(0);
		System.out.println("integer = " + integer);
	}
}
