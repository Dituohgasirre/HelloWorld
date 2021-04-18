package qingke2;

public class Hand {
	public Card[] cards = new Card[5];

	// 递归检测
	private boolean judge(int count, int start, Card[] hand, int target) {
		if (target == 0 && count == 3)
			return true;
		if (start == hand.length)
			return false;
		return judge(count + 1, start + 1, hand, target - hand[start].getNumber())
				|| judge(count, start + 1, hand, target);

	}

	// 是否有牛
	public boolean isHave() {
		boolean result = judge(0, 0, cards, 10) || judge(0, 0, cards, 20) || judge(0, 0, cards, 30);
		return result;
	}

	// 返回牛几
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
			return "一";
		case 2:
			return "二";
		case 3:
			return "三";
		case 4:
			return "四";
		case 5:
			return "五";
		case 6:
			return "六";
		case 7:
			return "七";
		case 8:
			return "八";
		case 9:
			return "九";
		case 10:
			return "牛";
		default:
			return "";
		}
	}

	// 返回手牌信息
	public String show() {
		String str = "手牌：";
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
			str += "有牛，牛" + strPoint() + ",";
		} else {
			str += "没牛，";
		}
		return str;
	}

}
