package lang.immutable.test;

public class MyDateImmutable {
	private final int year;
	private final int month;
	private final int day;

	public MyDateImmutable(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}

	public MyDateImmutable withYear(int year) {
		return new MyDateImmutable(year, this.month, this.day);
	}

	public int getYear() {
		return year;
	}

	public int getMonth() {
		return month;
	}

	public int getDay() {
		return day;
	}

	@Override
	public String toString() {
		return year + "-" + month + "-" + day;
	}
}
