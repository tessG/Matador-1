import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CardDeck {

    int TEMP_MAX = 3;
    Card[] cards;

    public CardDeck() {
        cards = new Card[TEMP_MAX];
    }

    /**
     * Load a deck of cards from a csv
     */
    public CardDeck(String csvFilePath) {
        cards = loadCardsFromCsv(csvFilePath);
        shuffle();
    }

    public Card[] loadCardsFromCsv(String path) {
        Card[] cards = new Card[TEMP_MAX];
        String[] cardStrings = Util.loadCsv(path);
        for (int i = 0; i < cardStrings.length; i++) {
            cards[i] = new Card(cardStrings[i]);
        }
        return cards;
    }

    public void shuffle() {
        Card[] shuffledDeck = new Card[cards.length];
        int[] indices = Util.range(0, cards.length);
        Util.shuffleArray(indices);
        for (int i : indices) {
            shuffledDeck[indices[i]] = cards[i];
        }
        cards = shuffledDeck;
    }

    public String toString() {
        StringBuilder s = new StringBuilder();
        for (Card c : cards) {
            s.append(c).append("\n");
        }
        return s.toString();
    }
}
