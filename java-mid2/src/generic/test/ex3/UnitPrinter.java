package generic.test.ex3;

import generic.test.ex3.unit.BioUnit;
import generic.test.ex3.unit.Shuttle;

public class UnitPrinter {

	static <T extends BioUnit> void printV1(Shuttle<T> t) {
		System.out.println(t.out());
	}

	static void printV2(Shuttle<? extends BioUnit> t) {
		System.out.println(t.out());
	}
}
