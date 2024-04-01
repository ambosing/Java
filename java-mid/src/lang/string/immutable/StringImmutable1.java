package lang.string.immutable;

public class StringImmutable1 {
	public static void main(String[] args) {
		String str = "hello";
		str.concat(" java");
		// string은 불변 객체이기 때문에 반환 값을 받아야함
		System.out.println("str = " + str);
	}
}
