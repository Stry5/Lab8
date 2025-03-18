public class DiceGame extends TableTopGame{
    private int numDice = 0;
    private int numDieSides = 6;

    public DiceGame(){}
    public DiceGame(String n){
        super(n);
    }
    public DiceGame(String n, Rule[] rs){
        super(n,rs);
    }
    public DiceGame(String n, Rule[] rs, int t, int ts){
        super(n,rs,t,ts);
    }
    public DiceGame(int nd, int nds){
        this.numDieSides = nds;
        this.numDice = nd;
    }

    public int getNumDice() {
        return this.numDice;
    }
    public int getNumDieSides() {
        return this.numDieSides;
    }
    public void setNumDice(int numDice) {
        this.numDice = numDice;
    }
    public void setNumDieSides(int numDieSides) {
        this.numDieSides = numDieSides;
    }
    public String toString(){
        return "DiceGame: " + this.getName();
    }

}
