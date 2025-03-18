public class BoardGame extends TableTopGame{
    private double boardWidth = 0.0;
    private double boardLength = 0.0;

    public BoardGame(){
        super();
    }
    public BoardGame(String n){
        super(n);
    }
    public BoardGame(String n, Rule[] rs){
        super(n,rs);
    }
    public BoardGame(String n, Rule[] rs, int t, int ts){
        super(n,rs,t,ts);
    }
    public BoardGame(double bw, double bl){
        this.boardWidth = bw;
        this.boardLength = bl;
    }

    public double getBoardLength() {
        return this.boardLength;
    }
    public double getBoardWidth() {
        return this.boardWidth;
    }
    public void setBoardLength(double boardLength) {
        this.boardLength = boardLength;
    }
    public void setBoardWidth(double boardWidth) {
        this.boardWidth = boardWidth;
    }
    public String toString(){
        return "BoardGame: " + this.getName();
    }

}
