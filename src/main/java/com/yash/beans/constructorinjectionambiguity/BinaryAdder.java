package com.yash.beans.constructorinjectionambiguity;

public class BinaryAdder {

    private double operand1;
    private double operand2;

    public BinaryAdder(double op1, double op2) {
        System.out.println("Double constructor invoked");
        this.operand1 = op1;
        this.operand2 = op2;
    }

    public BinaryAdder(int op1, int op2) {
        System.out.println("Integer constructor invoked");
        this.operand1 = op1;
        this.operand2 = op2;
    }

    public BinaryAdder(String op1, String op2) {
        System.out.println("String constructor invoked");
        this.operand1 = Double.parseDouble(op1);
        this.operand2 = Double.parseDouble(op2);
    }

    @Override
    public String toString() {
        return "BinaryAdder{" +
                "operand1=" + operand1 +
                ", operand2=" + operand2 +
                '}';
    }
}
