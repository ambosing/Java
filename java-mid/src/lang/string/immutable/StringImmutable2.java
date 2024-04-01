package lang.string.immutable;

public class StringImmutable2 {
	public static void main(String[] args) {
		String str1 = "hello";
		String str2 = str1.concat(" java");
		// string은 불변 객체이기 때문에 반환 값을 받아야함
		System.out.println("str = " + str2);
	}
}
