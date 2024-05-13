package generic.ex3;

import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalHospitalMainV2 {
	public static void main(String[] args) {
		AnimalHospitalV2<Dog> dogHospital = new AnimalHospitalV2<>();
		AnimalHospitalV2<Cat> catHospital = new AnimalHospitalV2<>();

		// 모든 타입이 다 올 수 있음
		AnimalHospitalV2<Integer> integerHospital = new AnimalHospitalV2<>();

		// 위와 같은 이유로 타입을 한정시켜야 하는 이유가 생긴다.
	}
}
