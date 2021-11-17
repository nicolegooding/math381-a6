import java.util.ArrayList;

public class Hand extends ArrayList {
    private int[] suits;
    private int[] ranks;


    public Hand(int initialCapacity) {
        super(initialCapacity);
        suits = new int[4];
        ranks = new int[13];
    }

    @Override
    public boolean add(Object o) {
        Card newCard = (Card) o;
        ranks[newCard.getRank()-1] += 1;
        suits[newCard.getSuit()-1] += 1;
        return super.add(newCard);
    }

    @Override
    public Card remove(int index){
        Card removed = (Card) super.remove(index);
        ranks[removed.getRank()-1] -= 1;
        suits[removed.getSuit()-1] -= 1;
        return removed;
    }

    @Override
    public Card get(int index) {
        return (Card) super.get(index);
    }

    public int[] getSuits(){
        return suits;
    }

    public int[] getRanks(){
        return ranks;
    }

    public int countSuit(int suit){
        return suits[suit - 1];
    }

    public int countRank(int rank){
        return ranks[rank - 1];
    }

    public boolean containsSuit(int suit){
        return countSuit(suit) != 0;
    }

    public boolean containsRank(int rank){
        return countRank(rank) != 0;
    }



}
