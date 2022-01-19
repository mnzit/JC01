package com.ggic.jb01;

public class Main {

    public static void main(String[] args) {
    MathCommand mathCommand =  MathCommandFactory.getCommand("-");

        System.out.println( mathCommand.calculate(1D,2D));

    MathContext mathContext = new MathContext(MathCommandFactory.getCommand("-"));
        System.out.println( mathContext.calculate(1D,2D));
    }

}
