package lang;

import java.util.Random;

public class LangMain {
	public static void main(String[] args) {
		Random random = new Random();
		System.out.println(String.format("%06d", random.nextInt(1000000)));
	}
}
