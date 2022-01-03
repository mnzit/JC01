public abstract class MathCommand {

    protected double i;
    protected double j;

    public void initParameters(double i, double j){
        this.i = i;
        this.j = j;
    }

    public abstract double calculate();
    
}
