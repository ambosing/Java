package generic.ex1;

public class RawTypeMain {

	public static void main(String[] args) {
		GenericBox integerBox = new GenericBox(); // 권장되지 않음, 그럼 왜 있을까?
													// 하위호환성 때문에

		// GenericBox<Object> integerBox2 = new GenericBox<>(); // 권장
		integerBox.set(10);
		Object object = integerBox.get();
		Integer integer = (Integer)integerBox.get();
		System.out.println("integer = " + integer);
	}
}
