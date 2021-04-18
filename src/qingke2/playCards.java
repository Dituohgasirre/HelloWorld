package qingke2;

import java.util.Random;

public class playCards {
	private Card[] cards;
	private int count = 0;

	public playCards() {
		initializeCards();
	}

	public void initializeCards() {
		cards = new Card[54];
		for (int i = 1; i <= 54; i++) {
			cards[i - 1] = new Card(i);
		}
	}

	public void shuffle() {
		Random r = new Random();
		int times = 500;
		int a, b;
		for (int i = 0; i < times; i++) {
			a = r.nextInt(54);
			b = r.nextInt(54);
			if (a != b) {
				Card p = cards[a];
				cards[a] = cards[b];
				cards[b] = p;
			}
		}
	}

	public boolean hasNext() {
		if (count < 54) {
			return true;
		} else {
			return false;
		}
	}

	public Card nextCard() {
		count++;
		return cards[count - 1];
	}
}
