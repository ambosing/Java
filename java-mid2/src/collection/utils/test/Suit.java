package collection.utils.test;

public enum Suit {
	SPADE("♠"),
	HEART("♥"),
	DIAMOND("♦"),
	CLUB("♣");

	private final String icon;

	Suit(String icon) {
		this.icon = icon;
	}

	public String getIcon() {
		return icon;
	}
}
