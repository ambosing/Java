package lang.string.chaining;

public class MethodChainingMain2 {
	public static void main(String[] args) {
		ValueAdder valueAdder = new ValueAdder();
		int value = valueAdder.add(1).add(2).add(3).getValue();

		System.out.println("value = " + value);
	}
}
