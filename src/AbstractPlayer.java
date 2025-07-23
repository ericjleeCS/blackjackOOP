import java.util.List;
import java.util.ArrayList;



public abstract class AbstractPlayer{
    List<Card> hand = new ArrayList<>();

    public void addCard(Card card){
        hand.add(card);
    }

    public int getHandValue(){
        int total = 0;
        int amtOfAces = 0;
        for (Card card: hand){
            if (card.isAce()){
                amtOfAces++;
            }
            total += card.getValue();
        }
        while (total > 21 && amtOfAces > 0){
            total -= 10;
            amtOfAces--;
        }
        return total;
    }

    public boolean isBust(){
        if (this.getHandValue() > 21){
            return true;
        }
        return false;
    }

    

}