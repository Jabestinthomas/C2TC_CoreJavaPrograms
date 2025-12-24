package com.tnsif.exceptionhandling1;

public class NestedTryBlockEx {

	public static int divide(int x, int y) {
		return x / y;   // exception handled in main
	}

	public static void main(String[] args) {
		try {
			int x = Integer.parseInt(args[0]);
			int y = Integer.parseInt(args[1]);

			int z = divide(x, y);
			System.out.println("Result of division is z: " + z);

		} catch (ArithmeticException ae) {
			System.err.println("Error! A number cannot be divided by zero.");

		} catch (NumberFormatException ne) {
			System.err.println("Error! Invalid input, number must be an integer.");

		} catch (ArrayIndexOutOfBoundsException ae) {
			System.err.println("Error! Please pass two numbers as command-line arguments.");
		}

		System.out.println("I am out of try-catch block");
	}
}
