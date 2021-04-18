package qingke2;

public class Hand {
	public Card[] cards = new Card[5];

	// �ݹ���
	private boolean judge(int count, int start, Card[] hand, int target) {
		if (target == 0 && count == 3)
			return true;
		if (start == hand.length)
			return false;
		return judge(count + 1, start + 1, hand, target - hand[start].getNumber())
				|| judge(count, start + 1, hand, target);

	}

	// �Ƿ���ţ
	public boolean isHave() {
		boolean result = judge(0, 0, cards, 10) || judge(0, 0, cards, 20) || judge(0, 0, cards, 30);
		return result;
	}

	// ����ţ��
	public int passPoint() {
		int point = 0;
		for (Card c : cards) {
			point += c.getNumber();
		}
		point = point % 10;
		if (point == 0) {
			point = 10;
		}
		return point;
	}

	public String strPoint() {
		switch (passPoint()) {
		case 1:
			return "һ";
		case 2:
			return "��";
		case 3:
			return "��";
		case 4:
			return "��";
		case 5:
			return "��";
		case 6:
			return "��";
		case 7:
			return "��";
		case 8:
			return "��";
		case 9:
			return "��";
		case 10:
			return "ţ";
		default:
			return "";
		}
	}

	// ����������Ϣ
	public String show() {
		String str = "���ƣ�";
		for (Card c : cards) {
			str += c.toString();
		}
		return str;
	}

	public String toString() {
		String str = "";
		str += show();
		str += "      ";
		if (isHave()) {
			str += "��ţ��ţ" + strPoint() + ",";
		} else {
			str += "ûţ��";
		}
		return str;
	}

}
