package collection.utils.test;

public class CardGameMain {
	public static void main(String[] args) {
		Deck deck = new Deck();
		PlayerDeck player1 = new PlayerDeck(deck.pick());
		PlayerDeck player2 = new PlayerDeck(deck.pick());

		player1.printAll();
		player2.printAll();

		int sum1 = player1.getSum();
		int sum2 = player2.getSum();
		if (sum1 > sum2) {
			System.out.println("플레이어 1 승리");
		} else if (sum1 < sum2) {
			System.out.println("플레이어 2 승리");
		} else {
			System.out.println("무승부");
		}
	}
}
