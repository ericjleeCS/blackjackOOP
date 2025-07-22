import java.util.List;
import java.util.ArrayList;
import java.util.*;

public class Deck {
    String[] cardList = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
    String[] suits = {"Hearts", "Diamonds", "Spades", "Clubs"};
    List<Card> cards = new ArrayList<>();


    public Deck(){
        buildSixDeck();
        shuffle();
    }

    public void buildSixDeck() {
        for (int i = 0; i < 6; i++){
            for (String card: cardList){
                for (String suit: suits){
                    cards.add(new Card(card,suit));
                }
            }
        }
    }

    public void shuffle(){
        Collections.shuffle(cards);
    }

    public int getDeckSize(){
        return cards.size();
    }

    public Card drawCard(){
        Card firstCard = cards.get(0);
        cards.remove(0);
        return firstCard;
    }

}
