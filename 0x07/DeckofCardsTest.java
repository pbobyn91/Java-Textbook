public class DeckofCardsTest {
	public static void main(String[] args) {
		DeckofCards myDeckOfCards = new DeckofCards();
		myDeckOfCards.shuffle();
		
		for (int i = 1; i <= 52; i++){
			System.out.printf("%-19s", myDeckOfCards.dealCard());
			
			if (i % 4 == 0){
				System.out.println();
			}
		}
	}
}