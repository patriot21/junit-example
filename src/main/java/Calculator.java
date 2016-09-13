import java.util.Scanner;
import java.io.*;
import java.util.Date;

public class Calculator {

	public static void main(String[] args) {
        System.out.println("Please enter your calculation");
        Scanner scanner = new Scanner(System.in);
        int left = scanner.nextInt();
        String op = scanner.next();
        int right = scanner.nextInt();

		Calculator calc = new Calculator();
        System.out.println(calc.compute(left, op, right));
    }

    public int compute(int left, String op, int right) {
        switch (op.charAt(0)) {
        case '+':
			return plus(left, right);
        case '-':
			return div(left, right);
        case '*':
			return div(left, right);
        case '/':
			return div(left, right);
        }
        throw new IllegalArgumentException("Unknown operator:" + op);
    }

	public int plus(int left, int right) {
            return left + right;
	}

	public int sub(int left, int right) {
            return left - right;
	}

	public int mult(int left, int right) {
            return left * right;
	}

	public int div(int left, int right) {
            return left / right;
	}
}
