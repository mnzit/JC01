package com.ggic.jb01;

public class MathCommandFactory{

    private static MathCommand addCommand = (operand1, operand2) -> operand1+operand2;
    private static MathCommand subCommand = (operand1, operand2) -> operand1-operand2;
    private static MathCommand divCommand = (operand1, operand2) -> operand1/operand2;
    private static MathCommand mulCommand = (operand1, operand2) -> operand1*operand2;

    public static MathCommand getCommand(String operator){
        switch (operator){
            case "+":
                return addCommand;
            case "-":
                return subCommand;
            case "/":
                return divCommand;
            case "*":
                return mulCommand;
            default:
                return null;
        }
    }
}
