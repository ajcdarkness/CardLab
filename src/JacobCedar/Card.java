package JacobCedar;

public class Card {
    private String rank; //card name
    private String suit; //suit
    private int pointValue; //values

    public Card(String rank, String suit, int pointValue){
        this.rank = rank;
        this.suit = suit;
        this.pointValue = pointValue;
    }
    public String getRank(){
        return this.rank;
    }
    public String getSuit(){
        return this.suit;
    }
    public int pointValue(){
        return this.pointValue;
    }
    public boolean equals(Card otherCard){
        return this.pointValue == otherCard.pointValue;
    }
    public String toString(){
        return "this is a " + this.rank + "of suit " + this.suit + "with value of " + this.pointValue;
    }

}
