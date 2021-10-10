package com.practice.assignment;

public class SimpleCalculator
{
	public static float calculate(int num1, int num2, String operation)
	{
		float result = 0;

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
