package generic.ex1;

public class BoxMain3 {
	public static void main(String[] args) {
		GenericBox<Integer> integerBox = new GenericBox<>(); // 생성 시점에 T의 타입이 결정
		integerBox.set(10);
		// integerBox.set("문자100"); // Integer 타입만 허용, 컴파일 오류
		Integer integer = integerBox.get(); // Integer 타입 반환(캐스팅 필요 X)
		System.out.println("integer = " + integer);

		GenericBox<String> stringBox = new GenericBox<>();
		stringBox.set("hello");
		String str = stringBox.get();
		System.out.println("str = " + str);

		// 원하는 모든 타입 사용 가능
		GenericBox<Double> doubleGenericBox = new GenericBox<>();
		doubleGenericBox.set(10.5);
		Double aDouble = doubleGenericBox.get();
		System.out.println("aDouble = " + aDouble);
	}
}
