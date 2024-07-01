package collection.utils.test;

import java.util.Objects;

public class Card {
	private final int number;
	private final Suit suit;

	public Card(int number, Suit suit) {
		this.number = number;
		this.suit = suit;
	}

	public int getNumber() {
		return number;
	}

	public Suit getSuit() {
		return suit;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		Card card = (Card)o;
		return getNumber() == card.getNumber() && suit == card.suit;
	}

	@Override
	public int hashCode() {
		return Objects.hash(getNumber(), suit);
	}

	@Override
	public String toString() {
		return number + "(" + suit.getIcon() + ")";
	}
}
