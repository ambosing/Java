package lang.immutable.change;

import lang.immutable.address.ImmutableAddress;

public class ImmutableObj {

	private final int value;

	public ImmutableObj(int value) {
		this.value = value;
	}

	public ImmutableObj add(int addValue) {
		return new ImmutableObj(value + addValue);
	}

	public int getValue() {
		return value;
	}

	@Override
	public String toString() {
		return "ImmutableObj{" +
			"value=" + value +
			'}';
	}
}
