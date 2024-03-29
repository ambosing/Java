package lang.immutable.test;

public class MyDateMain2 {
	public static void main(String[] args) {
		MyDateImmutable date1 = new MyDateImmutable(2024, 1, 1);
		MyDateImmutable date2 = new MyDateImmutable(2024, 1, 1);

		System.out.println("date1 = " + date1);
		System.out.println("date2 = " + date2);

		System.out.println("2025 -> date1");
		date1 = date1.withYear(2025);
		System.out.println("date1 = " + date1);
		System.out.println("date2 = " + date2);
	}
}
