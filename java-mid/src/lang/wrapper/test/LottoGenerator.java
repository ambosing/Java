package lang.wrapper.test;

import java.util.Random;

public class LottoGenerator {
	private final Random random = new Random();
	private int[] lottoNumber;
	private int count;

	public int[] generate() {
		lottoNumber = new int[6];
		count = 0;

		while (count < lottoNumber.length) {
			lottoNumber[count] = random.nextInt(45) + 1;
			if (isUnique(count)) {
				count++;
			}
		}
		return lottoNumber;
	}

	public boolean isUnique(int index) {
		for (int i = index - 1; i > 0; i--) {
			if (lottoNumber[i] == lottoNumber[index]) {
				return false;
			}
		}

		return true;
	}
}
