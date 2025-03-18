public class PhysicalSport extends Sport{
    private boolean aerobic = false;

    public PhysicalSport(){}
    public PhysicalSport(String n){
        super(n);
    }
    public PhysicalSport(String n, Rule[] rs){
        super(n,rs);
    }
    public PhysicalSport(String n, Rule[] rs, int t, int ts){
        super(n,rs,t,ts);
    }
    public PhysicalSport(boolean a){
        this.aerobic = a;
    }

    public boolean isAerobic() {
        return aerobic;
    }
    public void setAerobic(boolean a){
        this.aerobic = a;
    }
    public String toString() {
        return "PhysicalSport: " + this.getName();
    }
}
