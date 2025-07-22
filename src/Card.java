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
        return Integer.parseInt(value);
    }

    public boolean isFace(){
        if (value.equals("Jack") || value.equals("Queen") || value.equals("King")){
            return true;
        }
        return false;
    }

    public boolean isAce(){
        if (value.equals("Ace")){
            return true;
        }
        return false;
    }

}