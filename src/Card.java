public class Card{
    String suit;
    String value;

    public Card(String value, String suit){
        this.value = value;
        this.suit = suit;
    }

    public int getValue(){
        if (isFace()){
            return 10;
        }
        else if (isAce()){
            return 11;
        }
        try{
            return Integer.parseInt(value);
        } catch (Exception e){
            throw new IllegalArgumentException("Invalid card value:" + value);
        }
    }

    public boolean isFace(){
        return value.equals("Jack") || value.equals("Queen") || value.equals("King");
    }
    public boolean isAce(){
        return value.equals("Ace");
    }
}