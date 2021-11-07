package com.company;

public class Calc {
    public static int summ (String operand1, String operand2, String vyr){
        int newOperand1 = Integer.parseInt(operand1);
        int newOperand2 = Integer.parseInt(operand2);

        switch (vyr) {
            case "+":
                return newOperand1 + newOperand2;
            case "-":
                return newOperand1 - newOperand2;
            case "*":
                return newOperand1 * newOperand2;
            case "/":
                return newOperand1 / newOperand2;
            default: throw new RuntimeException("неизвестный оператор: "+vyr);

        }
    }
}
