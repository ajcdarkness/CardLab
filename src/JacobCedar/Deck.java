package JacobCedar;
import java.util.*;
public class Deck {
    private ArrayList<Card> unDealt = new ArrayList<Card>();
    private ArrayList<Card> dealt = new ArrayList<Card>();

    public Deck(String[] rank, String[] suit, int[] pointValue){
        for(int i =0; i < pointValue.length; i++){
            unDealt.add(new Card(rank[i], suit[i], pointValue[i]));
        }

    }
    public boolean isEmpty(){
        return unDealt.size() == 0;
    }
}
