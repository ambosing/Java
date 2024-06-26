package collection.map.test;

import java.util.HashMap;
import java.util.Map;

public class WordFrequencyTest2 {
	public static void main(String[] args) {
		String text = "orange banana apple apple banana apple";

		Map<String, Integer> map = new HashMap<>();

		String[] words = text.split(" ");
		for (String word : words) {
			Integer count = map.getOrDefault(word, 0);
			map.put(word, ++count);
		}
		System.out.println(map);
	}
}
