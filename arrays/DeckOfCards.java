public class DeckOfCards{
	
	String [] rank = {"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};
	String [] suit = {"Clubs","Diamonds","Hearts","Spades"};

	public DeckOfCards(){
	
		String [] deck = new String[52];
		// Create the deck
		for (int i = 0; i <13; i++){
			for (int j = 0; j < 4; j++){
				deck[4*i + j] = rank[i] + " of " + suit[j];
			}
		}

		// Shuffle the deck

		int N = deck.length;
		for (int i = 0; i < N; i++){
			int r = i + (int) (Math.random() * (N-i)); //Pick random card in deck
			String t = deck[r];
			deck[r] = deck[i];
			deck[i] = t;
		}
		
		for (int i = 0; i < N; i++){
		System.out.println(deck[i]);
		}
	}

	public static void main (String [] args){
		
		

		DeckOfCards aDeck = new DeckOfCards();
		
	}
}