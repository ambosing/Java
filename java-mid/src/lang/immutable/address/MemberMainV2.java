package lang.immutable.address;

public class MemberMainV2 {
	public static void main(String[] args) {
		ImmutableAddress address = new ImmutableAddress("서울");

		MemberV2 member1 = new MemberV2("회원A", address);
		MemberV2 member2 = new MemberV2("회원B", address);

		System.out.println("member1 = " + member1);
		System.out.println("member2 = " + member2);

		// 회원 2의 주소를 부산으로 변경해야 함
		ImmutableAddress address2 = new ImmutableAddress("부산");
		member2 = new MemberV2("회원B", address2);
		System.out.println("부산 -> memberB.address");
		System.out.println("member1 = " + member1);
		System.out.println("member2 = " + member2);
	}
}
