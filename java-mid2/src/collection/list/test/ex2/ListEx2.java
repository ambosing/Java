package collection.list.test.ex2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListEx2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		List<Integer> list = new ArrayList<>();
		while (true) {
			int i = scanner.nextInt();
			if (i == 0) {
				break;
			}

			list.add(i);
		}

		System.out.println(list.stream().map(String::valueOf).collect(Collectors.joining(", ")));
	}
}
