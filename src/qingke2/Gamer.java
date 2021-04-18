package qingke2;

public class Gamer extends Role {
	private Hand hand = new Hand();// 手牌
	private int countHand = 0;// 计数第几张手牌

	public Gamer() {

	}

	public Gamer(String name) {
		super(name);
	}

	public void getCard(Card card) {
		if (countHand < 5) {
			hand.cards[countHand] = card;
			countHand++;
		} else {
			System.out.println("已经5张手牌了");
		}
	}

	// 返回手牌
	public Hand getHand() {
		return hand;
	}

	// 显示结果
	public void look() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(hand.toString());

	}

	// 翻牌
	public void flop() {
		System.out.println(hand.show());
	}
}
