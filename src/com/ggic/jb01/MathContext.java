package com.ggic.jb01;

public class MathContext implements MathCommand{

    private MathCommand mathCommand;

    public MathContext(MathCommand mathCommand) {
        this.mathCommand = mathCommand;
    }

    @Override
    public Double calculate(Double operand1, Double operand2) {
        return mathCommand.calculate(operand1,operand2);
    }
}
