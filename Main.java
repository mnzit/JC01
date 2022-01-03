public class Main {

    // JVM -> Main Thread -> Main.main
    public static void main(String args[]){
       MathCommand command = new SquareRootCommand();
       command.initParameters(49, 2);
       double result = command.calculate();
       System.out.println(result);
    }

    
}