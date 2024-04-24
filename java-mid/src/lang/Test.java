package lang;

import java.util.Arrays;

public class Test {
	public static void main(String[] args) {
		String[] mapping = {"/**"};

		System.out.println(Arrays.toString(mapping));
		test(mapping);
	}

	private static void test(String... inputs) {
		for (String input : inputs) {
			System.out.print(input + " ");
		}
	}
}
