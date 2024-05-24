package collection.list.test.ex3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListEx3 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		while (true) {
			int input = scanner.nextInt();
			if (input == 0) {
				break;
			}
			list.add(input);
		}

		int sum = list.stream().reduce(Integer::sum).get();
		double avg = (double)sum / list.size();
		System.out.println("sum = " + sum);
		System.out.println("avg = " + avg);
	}
}
