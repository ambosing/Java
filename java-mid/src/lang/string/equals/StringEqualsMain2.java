package lang.string.equals;

public class StringEqualsMain2 {
	public static void main(String[] args) {
		String str1 = new String("hello");
		String str2 = new String("hello");
		System.out.println("메서드 호출 비교1 : " + isSame(str1, str2));

		String str3 = "hello";
		String str4 = "hello";
		System.out.println("메서드 호출 비교2 : " + isSame(str3, str4));
	}

	// 이 메서드를 구현하는 개발자는 문자열 풀에서 가져오는 리터럴이 매개변수로 들어올지, new String으로 매개변수로 들어올지 모른다.
	// 그래서 항상 equals로 비교해야 한다.
	private static boolean isSame(String x, String y) {
		// return x == y;
		return x.equals(y);
	}
}
