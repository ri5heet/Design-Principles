package model;

public class CalculatorModel implements Calculator{

	private double num1;
    private double num2;

    public CalculatorModel(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;

    }

    public double addition() {
        return num1 + num2;
    }

    public double subtraction() {
        return num1 - num2;
    }

    public double multiplication() {
        return num1 * num2;
    }

    public double division() {
        return num1 / num2;
    }
}
