public class Rule {
    private String text = "Empty rule";
    private boolean optional = false;

    public Rule(){}
    public Rule(String t){
        this.text = t;
    }
    public Rule(String t, boolean o){
        this(t);
        this.optional = o;
    }

    public String getText() {
        return this.text;
    }
    public boolean isOptional() {
        return this.optional;
    }
    public void setText(String text) {
        this.text = text;
    }
    public void setOptional(boolean optional) {
        this.optional = optional;
    }
    public String toString(){
        return this.text;
    }
}
