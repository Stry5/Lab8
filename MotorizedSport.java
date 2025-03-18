public class MotorizedSport extends Sport{
    private String medium = "land";

    public MotorizedSport(){}
    public MotorizedSport(String n){
        super(n);
    }
    public MotorizedSport(String n, Rule[] rs){
        super(n,rs);
    }
    public MotorizedSport(String n, Rule[] rs, int t, int ts){
        super(n,rs,t,ts);
    }
    public MotorizedSport(String n,String m){
        super(n);
        this.medium = m;
    }

    public String getMedium() {
        return medium;
    }
    public void setMedium(String medium) {
        this.medium = medium;
    }

    public String toString() {
        return "MotorizedSport: " + this.getName();
    }
}
