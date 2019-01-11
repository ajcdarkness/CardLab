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
    public int size(){
        return unDealt.size();
    }

    public Card deal(){
        if(unDealt.size() != 0){
            Card card = unDealt.get(0);
            dealt.add(card);
            unDealt.remove(0);
            return card;
        }
        else return null;
    }
    public void shuffle(){
        while(dealt.size() > 0){
            unDealt.add(dealt.get(0));
            dealt.remove(0);

        }
        for(int i = 51; i > 0; i --){
            int num = (int)(Math.random() * (i+1));
            Card c = unDealt.get(num);
            unDealt.set(num, unDealt.get(i));
            unDealt.set(i, c);
        }
    }
}
