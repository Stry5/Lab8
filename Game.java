public class Game {
    // private instance variables
    private String name;
    private Rule[] rules = new Rule[100];
    private int numRules = 0;
    private int teams = 0;
    private int teamSize = 0;

    // constructors
    public Game(){}
    public Game(String n){
        this();
        this.name = n;
    }
    public Game(String n, Rule[] rs){
        this(n);
        if(rs.length > (this.rules.length - this.numRules)) {
            System.out.print("Error, array size too large\n");
            System.exit(1);
        }
        for(int i = 0; i < rs.length; i++){
            this.rules[numRules] = rs[i];
            this.numRules++;
        }



    }
    public Game(String n, Rule[] rs, int t, int ts){
        this(n,rs);
        this.teams = t;
        this.teamSize = ts;
    }

    // getters and setters
    public String getName() {
        return this.name;
    }
    public int getTeams() {
        return this.teams;
    }
    public int getTeamSize() {
        return this.teamSize;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setNumRules(int numRules) {
        this.numRules = numRules;
    }
    public void setTeamSize(int teamSize){ this.teamSize =teamSize; }

    // instance methods
    public boolean addRule(Rule r){
        if(numRules > 99){
            return false;
        }else{
            rules[numRules] = r;
            numRules++;
            return true;
        }
    }
    public Rule[] getRules(){
        return rules;
    }
    public int getNumRules(){ return numRules; }
}
