package lang.string;

public class StringConcatMain {
	public static void main(String[] args) {
		String a = "hello";
		String b = " java";

		String result1 = a.concat(b);
		String result2 = a + b; // 원래는 참조 값으로, 더하는 연산이 불가능 / 하지만 문자열은 concat으로 동작

		System.out.println("result1 = " + result1);
		System.out.println("result2 = " + result2);

	}
}
