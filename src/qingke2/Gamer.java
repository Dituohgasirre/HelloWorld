package qingke2;

public class Gamer extends Role {
	private Hand hand = new Hand();// ����
	private int countHand = 0;// �����ڼ�������

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
			System.out.println("�Ѿ�5��������");
		}
	}

	// ��������
	public Hand getHand() {
		return hand;
	}

	// ��ʾ���
	public void look() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(hand.toString());

	}

	// ����
	public void flop() {
		System.out.println(hand.show());
	}
}
