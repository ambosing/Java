package collection.utils.test;

import java.util.List;
import java.util.stream.Collectors;

public class PlayerDeck {
	private final List<Card> cards;

	public PlayerDeck(List<Card> cards) {
		this.cards = cards;
		this.cards.sort(new CardComparator());
	}

	public void printAll() {
		cards.sort(new CardComparator());
		String sb = "["
			+ cards.stream().map(Card::toString).collect(Collectors.joining(", "))
			+ "], 합계: "
			+ getSum();
		System.out.println(sb);
	}

	public int getSum() {
		return cards.stream().map(Card::getNumber).reduce(0, Integer::sum);
	}
}
