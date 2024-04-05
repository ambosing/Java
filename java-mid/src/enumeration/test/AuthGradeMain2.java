package enumeration.test;

import java.util.Scanner;

public class AuthGradeMain2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("당신의 등급을 입력하세요[GUEST, LOGIN, ADMIN]: ");
		AuthGrade authGrade = AuthGrade.valueOf(scanner.nextLine().toUpperCase());

		printDescription(authGrade);
		printMenu(authGrade);
	}

	private static void printMenu(AuthGrade authGrade) {
		StringBuilder sb = new StringBuilder("==메뉴 목록==\n");
		if (authGrade.getLevel() >= 1) {
			sb.append("- 메인 화면\n");
		}
		if (authGrade.getLevel() >= 2) {
			sb.append("- 이메일 관리 화면\n");
		}
		if (authGrade.getLevel() >= 3) {
			sb.append("- 관리자 화면");
		}
		System.out.println(sb);
	}

	private static void printDescription(AuthGrade grade) {
		System.out.println("당신의 등급은 " + grade.getDescription() + "입니다.");
	}
}
