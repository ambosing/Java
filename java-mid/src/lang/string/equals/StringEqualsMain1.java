package lang.string.equals;

public class StringEqualsMain1 {

	public static void main(String[] args) {
		String str1 = new String("hello");
		String str2 = new String("hello");
		System.out.println("new String() == 비교 : " + (str1 == str2));
		System.out.println("new String() equals 비교 : " + (str1.equals(str2)));

		String str3 = "hello";
		String str4 = "hello";
		// 리터럴은 문자열 풀에 넣게 됨
		// str4는 str3가 생성될 때 생긴 문자열 풀에 있는 "hello" 참조값을 반환하게 된다.
		// 문자열 풀은 해시 알고리즘을 사용하기 때문에 매우 빠른 속도로 원하는 String을 찾을 수 있다.
		System.out.println("리터럴 == 비교 : " + (str3 == str4));
		System.out.println("리터럴 equals 비교 : " + (str3.equals(str4)));
	}
}
