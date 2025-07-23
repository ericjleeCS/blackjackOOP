import java.util.Scanner; 



public class Player extends AbstractPlayer{

    public void takeTurn(Deck deck){
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("Your current hand value is: " + this.getHandValue());
            System.out.println("Please enter hit or stay");
            String decision = scanner.nextLine();

            if (decision.equals("hit")){
                Card drawnCard = deck.drawCard();
                this.addCard(drawnCard);
                System.out.println("You drew:" + drawnCard.getValue());

                if (isBust()){
                    System.out.println("You busted");
                    break;
                }
            }
            else if(decision.equals("stay")){
                break;
            }  
        }
        scanner.close();
    }

        


}