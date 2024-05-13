package generic.ex3;

import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalHospitalMainV3 {
	public static void main(String[] args) {

		AnimalHospitalV3<Dog> dogHospital = new AnimalHospitalV3<>();
		AnimalHospitalV3<Cat> catHospital = new AnimalHospitalV3<>();
		// AnimalHospitalV3<Integer> integerAnimalHospitalV3 = new AnimalHospitalV3<Integer>(); // Animal 자신과 하위타입이 아니면 오류

		Dog dog = new Dog("멍멍이1", 100);
		Cat cat = new Cat("냐옹이1", 300);

		dogHospital.set(dog);
		dogHospital.checkup();

		catHospital.set(cat);
		catHospital.checkup();

		// 문제 1 : 개 병원에 고양이 전달
		// dogHospital.set(cat); // 매개변수 체크 : 컴파일 오류 발생

		// 문제 2 : 개 타입 반환
		dogHospital.set(dog);
		Dog biggerDog = dogHospital.bigger(new Dog("멍멍이2", 200)); // 코드 안정성 O
		System.out.println("biggerDog = " + biggerDog);
	}
}
