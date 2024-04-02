package lang.system;

import java.util.Arrays;
import java.util.Map;
import java.util.Properties;

public class SystemMain {
	public static void main(String[] args) {
		long currentTimeMillis = System.currentTimeMillis();

		System.out.println("currentTimeMillis = " + currentTimeMillis);

		long currentTimeNano = System.nanoTime();
		System.out.println("currentTimeNano = " + currentTimeNano);

		Map<String, String> env = System.getenv();
		System.out.println("env = " + env);

		Properties properties = System.getProperties();
		System.out.println("properties = " + properties);
		System.out.println("Java version: " + System.getProperty("java.version"));

		// 배열을 고속을 복사한다.
		// 하드웨어 레벨에서 통째로 복사
		// 최소 2배 ~ 5배 정도 빠르다.
		char[] originalArray = {'h', 'e', 'l', 'l', 'o'};
		char[] copiedArray = new char[5];
		System.arraycopy(originalArray, 0, copiedArray, 0, originalArray.length);

		System.out.println("copiedArray = " + Arrays.toString(copiedArray));

		// 프로그램 종료
		System.exit(0);
	}
}
