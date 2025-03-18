public class TableTopGame extends Game{

    // constructors only
    public TableTopGame(){
        super();
    }
    public TableTopGame(String n){
        super(n);
    }
    public TableTopGame(String n, Rule[] rs){
        super(n,rs);
    }
    public TableTopGame(String n, Rule[] rs, int t, int ts){
        super(n,rs,t,ts);
    }
}
