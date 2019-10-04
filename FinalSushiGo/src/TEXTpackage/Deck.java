package TEXTpackage;
import java.util.*;

/**
*Represents the Deck that will be used in the game
*The Deck is comprised of 104 cards that will be used in the game
*The hand used to play the game will be created from the Deck
*/

public class Deck {
	// instance variables
	private LinkedList<String> deckOfCards;
	private LinkedList<String>[] hands;
	private Random randCard;
	
	/**
	*The Deck method creates the deck by running through a for loop
	*that makes sure the appropriate amount of each card is added into
	*the deck.
	*This method does not take in any parameters and does not return 
	*anything
	*/
	
	public Deck() {
		deckOfCards = new LinkedList<String>();

		for(int cardNumber = 0; cardNumber < 5; cardNumber++) {
			deckOfCards.add("EggNigiri");
			deckOfCards.add("SquidNigiri");
		}

		for(int cardNumber = 0; cardNumber < 6; cardNumber++) {
			deckOfCards.add("Wasabi");
		}
		
		for(int cardNumber = 0; cardNumber < 10; cardNumber++) {
			deckOfCards.add("SalmonNigiri");
			deckOfCards.add("Pudding");
		}

		for(int cardNumber = 0; cardNumber < 14; cardNumber++) {
			deckOfCards.add("Sashimi");
			deckOfCards.add("Dumpling");
			deckOfCards.add("Tempura");
		}

		for(int cardNumber = 0; cardNumber < 26; cardNumber++) {
			deckOfCards.add("MakiRoll");
		}
	}

	
	/**
	*setHand method used to create a hand from the deck
	*Cards from the deck are taken at random, and once the card is
	*added to the hand, the card is removed from the deck
	*@param numHandsnumber      number of type int of hands to be created 
	*@return hands    an array of Linked lists containing the number of hands specified
	*/
	
	@SuppressWarnings("unchecked")
	public LinkedList<String>[] setHand(int numHands){
		randCard = new Random();
		hands = new LinkedList[numHands];
		for(int handNum = 0; handNum < numHands; handNum++) {
			LinkedList<String> hand = new LinkedList<String>();
			for(int count = 0; count < 10; count ++) {
				int cardNum = randCard.nextInt(deckOfCards.size());
				String newCard = deckOfCards.get(cardNum);
				hand.add(newCard);
				deckOfCards.remove(cardNum);
			}
			hand.sort(null);
			hands[handNum] = hand;
		}
		return hands;
	}
}