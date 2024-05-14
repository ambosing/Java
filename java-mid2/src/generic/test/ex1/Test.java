package generic.test.ex1;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		System.out.println(solution(5, new int[] {9, 20, 28, 18, 11}, new int[] {30, 1, 21, 17, 28}));
	}

	public static String[] solution(int n, int[] arr1, int[] arr2) {
		List<String> answer = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			String row = Integer.toBinaryString((arr1[i] | arr2[i]));
			String processedRow = String.format("%" + n + "s", row);
			processedRow = processedRow.replace("1", "#");
			processedRow = processedRow.replace("0", " ");
			answer.add(processedRow);
		}
		return answer.toArray(String[]::new);
	}
}
