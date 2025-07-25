public class App {
    public static void main(String[] args) throws Exception {
        Deck deck = new Deck();
        Player player = new Player();
        Dealer dealer = new Dealer();

        player.drawFromDeck(deck);
        dealer.drawFromDeck(deck);
        player.drawFromDeck(deck);
        
        System.out.println("Player's card total is: " + player.getHandValue());
        System.out.println("Dealer's hand total is: " + dealer.getHandValue());

        dealer.addCard(deck.drawCard());
        player.takeTurn(deck);
        dealer.takeTurn(deck, player);

        dealer.determineWinner(player);


        System.out.println("Player's card total is: " + player.getHandValue());
        System.out.println("Dealer's hand total is: " + dealer.getHandValue());



    }
}
