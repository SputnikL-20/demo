package appwindows;

public class DeckOfCards {

	public static int m = 52;
	public static int n = 2;

	public static String[] fullDeck() {

		String[] SUITS = { "C.png", "D.png", "H.png", "S.png" };
		String[] RANKS = { "img/2", "img/3", "img/4", "img/5", "img/6", "img/7", "img/8", "img/9", "img/10", "img/J",
				"img/Q", "img/K", "img/A" };
		String[] deck = new String[RANKS.length * SUITS.length];

		for (int i = 0; i < RANKS.length; i++) {
			for (int j = 0; j < SUITS.length; j++) {
				deck[SUITS.length * i + j] = RANKS[i] + SUITS[j]; // " of " +
			}
		}
		return deck;
	}

	public static String[] shufflingTheDeck(String[] deck) {

		// shuffling cards
		for (int i = 0; i < deck.length; i++) {
			int r = (int) (i + Math.random() * (deck.length - i));
			String temp = deck[i];
			deck[i] = deck[r];
			deck[r] = temp;
		}
		return deck;
	}

	public static String[][] testDeck(String[] deck) {
		String[][] multideck = new String[m][n];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				for (int d = 0; d < deck.length; d++) {
					if (j % 2 == 0) {
						multideck[i][j] = deck[i];
					} else {
						multideck[i][j] = String.valueOf(cardPoint(deck[i]));
					}
				}
			}
		}
		return multideck;
	}

	public static int cardPoint(String param) {

		switch (param) {

		case ("img/2C.png"):
			return 2;
		case ("img/2D.png"):
			return 2;
		case ("img/2H.png"):
			return 2;
		case ("img/2S.png"):
			return 2;
		case ("img/3C.png"):
			return 3;
		case ("img/3D.png"):
			return 3;
		case ("img/3H.png"):
			return 3;
		case ("img/3S.png"):
			return 3;
		case ("img/4C.png"):
			return 4;
		case ("img/4D.png"):
			return 4;
		case ("img/4H.png"):
			return 4;
		case ("img/4S.png"):
			return 4;
		case ("img/5C.png"):
			return 5;
		case ("img/5D.png"):
			return 5;
		case ("img/5H.png"):
			return 5;
		case ("img/5S.png"):
			return 5;
		case ("img/6C.png"):
			return 6;
		case ("img/6D.png"):
			return 6;
		case ("img/6H.png"):
			return 6;
		case ("img/6S.png"):
			return 6;
		case ("img/7C.png"):
			return 7;
		case ("img/7D.png"):
			return 7;
		case ("img/7H.png"):
			return 7;
		case ("img/7S.png"):
			return 7;
		case ("img/8C.png"):
			return 8;
		case ("img/8D.png"):
			return 8;
		case ("img/8H.png"):
			return 8;
		case ("img/8S.png"):
			return 8;
		case ("img/9C.png"):
			return 9;
		case ("img/9D.png"):
			return 9;
		case ("img/9H.png"):
			return 9;
		case ("img/9S.png"):
			return 9;
		case ("img/10C.png"):
			return 10;
		case ("img/10D.png"):
			return 10;
		case ("img/10H.png"):
			return 10;
		case ("img/10S.png"):
			return 10;
		case ("img/JC.png"):
			return 2;
		case ("img/JD.png"):
			return 2;
		case ("img/JH.png"):
			return 2;
		case ("img/JS.png"):
			return 2;
		case ("img/QC.png"):
			return 3;
		case ("img/QD.png"):
			return 3;
		case ("img/QH.png"):
			return 3;
		case ("img/QS.png"):
			return 3;
		case ("img/KC.png"):
			return 4;
		case ("img/KD.png"):
			return 4;
		case ("img/KH.png"):
			return 4;
		case ("img/KS.png"):
			return 4;
		case ("img/AC.png"):
			return 11;
		case ("img/AD.png"):
			return 11;
		case ("img/AH.png"):
			return 11;
		case ("img/AS.png"):
			return 11;
		default:
			return 0;
		}
	}
}
