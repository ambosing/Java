package collection.utils.test;

import java.util.Comparator;

public class CardComparator implements Comparator<Card> {

	@Override
	public int compare(Card o1, Card o2) {
		if (o1.getNumber() != o2.getNumber()) {
			return Integer.compare(o1.getNumber(), o2.getNumber());
		} else {
			return o1.getSuit().compareTo(o2.getSuit());
		}
	}
}
