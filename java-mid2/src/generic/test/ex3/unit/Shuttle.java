package generic.test.ex3.unit;

import java.util.ArrayList;

public class Shuttle<T extends BioUnit> {
	private final ArrayList<T> inUnit = new ArrayList<>();

	public void in(T t) {
		inUnit.add(t);
	}

	public T out() {
		return inUnit.getFirst();
	}

	public void showInfo() {
		for (T t : inUnit) {
			System.out.println(t);
		}
	}
}
