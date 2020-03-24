package src.ru.mirea.pract7;
import java.util.ArrayDeque;

public class Cardpack {
    ArrayDeque<Integer> cardDeck;
    public void start(int[] cards) {
        cardDeck = new ArrayDeque<Integer>(cards.length);
        for(int card : cards) {
            cardDeck.push(card);
        }
    }

    public int checkTop() {
        return cardDeck.getFirst();
    }

    public void addBottom(int last) {
        cardDeck.addLast(last);
    }

    public int removeTop() {
        return cardDeck.removeFirst();
    }

    public void show(int k) {
        System.out.println(cardDeck.toString() + " " + k);
    }

    public boolean isEmpty() {
        return cardDeck.isEmpty();
    }

}
