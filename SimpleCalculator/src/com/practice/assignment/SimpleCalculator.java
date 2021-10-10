package com.practice.assignment;

public class SimpleCalculator
{
	public static double calculate(double num1, double num2, String operation)
	{
		double result = 0;

		switch(operation)
		{
			case "+":
				result = (num1 + num2);
				break;
			case "-":
				result = (num1 - num2);
				break;
			case "*":
				result = (num1 * num2);
				break;
			case "/":
				result = (num1 / num2);
				break;
			default:
				result = 0;
		}

		return result;
	}
}
