public class Sport extends Game{
    private boolean olympic = false;
    private double riskLevel = 0.0;

    public Sport(){
        super();
    }
    public Sport(String n){
        super(n);
    }
    public Sport(String n, Rule[] rs){
        super(n,rs);
    }
    public Sport(String n, Rule[] rs, int t, int ts){
        super(n,rs,t,ts);
    }
    public Sport(boolean o, double rl){
        this.olympic = o;
        this.riskLevel = rl;
    }

    public boolean isOlympic() {
        return this.olympic;
    }
    public double getRiskLevel() {
        return this.riskLevel;
    }
    public void setRiskLevel(double riskLevel) {
        this.riskLevel = riskLevel;
    }
    public void setOlympic(boolean olympic) {
        this.olympic = olympic;
    }
    public String toString(){
        return "Sport:" + this.getName();
    }

}
