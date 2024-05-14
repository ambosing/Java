package generic.ex5;

import generic.animal.Animal;
import generic.animal.Cat;
import generic.animal.Dog;

public class WildcardMain2 {
	public static void main(String[] args) {

		Box<Object> objectBox = new Box<>();
		Box<Dog> dogBox = new Box<>();
		Box<Cat> catBox = new Box<>();
		Box<Animal> animalBox = new Box<>();

		// Animal 포함 상위 타입 전달 가능
		writeBox(objectBox);
		writeBox(animalBox); // 자기 자신까지 가능
		// writeBox(dogBox); // 하한이 Animal
		// writeBox(catBox); // 하한이 Animal
	}

	static void writeBox(Box<? super Animal> box) {
		box.set(new Dog("멍멍이", 100));
	}
}
