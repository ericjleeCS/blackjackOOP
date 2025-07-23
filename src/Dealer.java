public class Dealer extends AbstractPlayer{

    public void takeTurn(Deck deck, Player player){
        while (this.getHandValue() < 17){
            if (player.isBust()){
                break;
            }
            Card drawnCard = deck.drawCard();
            this.addCard(drawnCard);
        }
    }

    public Winner determineWinner(Player player){
        if (player.isBust()){
            System.out.println("Dealer won this hand!");
            return Winner.DEALER;
        }
        else if (this.isBust()){
            System.out.println("Player won this hand!");
            return Winner.PLAYER;
        }   
        else if (this.getHandValue() > player.getHandValue()){
            System.out.println("Dealer won this hand!");
            return Winner.DEALER;
        }
        else if (this.getHandValue() < player.getHandValue()){
            System.out.println("Player has won this hand!");
            return Winner.PLAYER;
        }
        else{
            System.out.println("It is a tie!");
            return Winner.TIE;
        }
    }
}