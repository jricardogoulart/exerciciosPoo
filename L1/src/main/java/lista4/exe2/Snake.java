package lista4.exe2;
public class Snake extends Animal {
    
    private boolean poisinous, smoke;

    public Snake() {
    super();
    }

    public Snake(boolean poisinous, boolean smoke, String name, int age) {
        super(name, age);
        this.setPoisinous(poisinous);
        this.setSmoke(smoke);
    }

    public boolean isPoisinous() {
        return poisinous;
    }

    public final void setPoisinous(boolean poisinous) {
        this.poisinous = poisinous;
    }

    public boolean isSmoke() {
        return smoke;
    }

    public final void setSmoke(boolean smoke) {
        this.smoke = smoke;
    }

    @Override
    public String toString() {
        return "Snake{" + "Is poisinous? = " + poisinous + ", Is smoke? = " + smoke + " " + super.toString()+'}';
    }
    @Override
    public String move(){
    return "Rasteja";
    }
    
}
