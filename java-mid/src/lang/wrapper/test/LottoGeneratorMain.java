package lang.wrapper.test;

import java.util.Arrays;

public class LottoGeneratorMain {
	public static void main(String[] args) {
		LottoGenerator lottoGenerator = new LottoGenerator();
		System.out.println(Arrays.toString(lottoGenerator.generate()));
	}
}
