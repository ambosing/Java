package collection.utils.test;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Deck {
	private final List<Card> cards = new LinkedList<>();

	public Deck() {
		for (Suit suit : Suit.values()) {
			for (int i = 1; i <= 13; i++) {
				cards.add(new Card(i, suit));
			}
		}
	}

	public List<Card> pick() {
		List<Card> result = new LinkedList<>();
		while (result.size() < 6) {
			result.add(pickOneRandom());
		}
		return result;
	}

	private Card pickOneRandom() {
		Collections.shuffle(cards);
		return cards.removeFirst();
	}
}
