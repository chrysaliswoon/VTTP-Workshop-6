package workshop.core;

public class Deck {

    
    //? Method
    public void Shuffle() {
        String[] SUITS = {
            "♣", "♦", "♥", "♠"
        };

        String[] RANKS = {
            "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"
        };

        //? Initialise the deck
        int cardType = SUITS.length * RANKS.length;
        String[] deck = new String[cardType];
        for (int i = 0; i < RANKS.length; i++) {
            for (int j = 0; j < SUITS.length; j++) {
                deck[SUITS.length*i + j] = RANKS[i] + " of " + SUITS[j]; 
            }
        }

        //? Shuffle the deck
        for (int i = 0; i < cardType; i++) {
            int r = i + (int) (Math.random() * (cardType-i));
            String temp = deck[r];
            deck[r] = deck[i];
            deck[i] = temp;
        }

        //? Print the shuffled deck
        for (int i = 0; i < cardType; i++) {
            System.out.println(deck[i]);
        }
    }
}
