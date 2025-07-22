import java.util.List;
import java.util.ArrayList;

public class Deck {
    String[] cardList = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
    String[] suits = {"Hearts", "Diamonds", "Spades", "Clubs"};
    List<Card> cards = new ArrayList<>();

    public int getLengthOfDeck() {
        return cardList.length;
    }

    public void buildSixDeck() {
        for (int i = 0; i < 6; i++){
            for (String card: cardList){
                for (String suit: suits){
                    cards.add(new Card(card,suit))
                }
            }
        }
    }
}
