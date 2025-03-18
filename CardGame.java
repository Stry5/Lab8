public class CardGame extends TableTopGame{
    private int numCards = 52;

    public CardGame(){
        super();
    }
    public CardGame(String n){
        super(n);
    }
    public CardGame(String n, Rule[] rs){
        super(n,rs);
    }
    public CardGame(String n, Rule[] rs,int t, int ts){
        super(n,rs,t,ts);
    }
    public CardGame(int nc){
        this.numCards = nc;
    }

    public int getNumCards() {
        return this.numCards;
    }
    public void setNumCards(int numCards) {
        this.numCards = numCards;
    }
    public String toString(){
        return "CardGame: " + this.getName();
    }

}
