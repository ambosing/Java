package enumeration.ex3;

import java.util.Arrays;

public class EnumMethodMain {
	public static void main(String[] args) {
		// 모든 ENUM 반환
		Grade[] values = Grade.values();
		System.out.println("values = " + Arrays.toString(values));
		for (Grade value : values) {
			System.out.println("value.name = " + value.name() + ", ordinal = " + value.ordinal());
		}

		// String -> ENUM 반환
		String input = "GOLD";
		Grade gold = Grade.valueOf(input);
		System.out.println("gold = " + gold);

		// 잘못된 문자면 예외 발생 IllegalArgumentException
		String input2 = "gold";
		// Grade grade = Grade.valueOf(input2);
		
	}
}
