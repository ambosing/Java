package collection.set;

import java.util.Arrays;

public class HashStart2 {
	public static void main(String[] args) {
		Integer[] inputArray = new Integer[10];
		inputArray[1] = 1;
		inputArray[2] = 2;
		inputArray[5] = 5;
		inputArray[8] = 8;
		System.out.println("Arrays.toString(inputArray) = " + Arrays.toString(inputArray));

		// 배열의 인덱스를 활용해 시간복잡도를 O(n) -> O(1) 변경
		int searchValue = 8;
		Integer result = inputArray[searchValue]; // O(1)
		System.out.println("result = " + result);
	}
}
