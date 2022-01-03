public class Main {

    // JVM -> Main Thread -> Main.main
    public static void main(String args[]){
       MathCommand command = new SubCommand();
       command.initParameters(1, 2);
       double result = command.calculate();
       System.out.println(result);
    }

    
}