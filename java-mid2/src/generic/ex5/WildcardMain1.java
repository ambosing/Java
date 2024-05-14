package generic.ex5;

import generic.animal.Animal;
import generic.animal.Cat;
import generic.animal.Dog;

public class WildcardMain1 {
	public static void main(String[] args) {
		Box<Object> objectBox = new Box<>();
		Box<Dog> dogBox = new Box<>();
		Box<Cat> catBox = new Box<>();

		dogBox.set(new Dog("멍멍이", 100));

		WildcardEx.printGenericV1(dogBox);
		WildcardEx.printWildcardV1(dogBox);

		WildcardEx.printGenericV2(dogBox);
		WildcardEx.printWildcardV2(dogBox);

		Dog dog = WildcardEx.printAndReturnGeneric(dogBox);

		catBox.set(new Cat("냐옹이", 200));
		Cat cat = WildcardEx.printAndReturnGeneric(catBox);

		// 반환 타입이나 이런 것들을 매번 바꿀 수 없다.
		Animal animal = WildcardEx.printAndReturnWildcard(dogBox);
	}
}
