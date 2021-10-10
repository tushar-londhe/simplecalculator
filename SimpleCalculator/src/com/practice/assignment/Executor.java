package com.practice.assignment;

import java.util.Scanner;

public class Executor
{

	public static void main(String[] args)
	{
		getInput();
	}

	private static void getInput()
	{
		Scanner scan = new Scanner(System.in);
		
		try
		{
			System.out.println("....");

			System.out.println("Welcome to Simple Calculator....");

			System.out.println("Please provide Number 1");

			int num1 = scan.nextInt();

			System.out.println("Please provide Number 2");

			int num2 = scan.nextInt();

			System.out.println("Please provide operation");
			System.out.println("Example:");
			System.out.println("1: '+' for addition");
			System.out.println("2: '-' for subtraction");
			System.out.println("3: '*' for multiplication");
			System.out.println("4: '/' for division");

			String operation = scan.next();

			float result = SimpleCalculator.calculate(num1, num2, operation);

			System.out.println("Result = " + result);

			System.out.println("Do you want to try again type 'Y' or 'N' ?");

			String option = scan.next();

			if ("Y".equalsIgnoreCase(option))
			{
				getInput();
			}
			else if ("N".equalsIgnoreCase(option))
			{
				System.out.println("Thank You for using Simple Calculator");
			}
			else
			{
				System.out.println("Invalid input ... exiting");
			}
			
		}
		catch (NumberFormatException nfe)
		{
			System.err.println("Please enter valid input... ");
			handleException();
		}
		catch (Exception e)
		{
			handleException();
		}
		finally
		{
			scan.close();
		}
	}

	private static void handleException()
	{
		System.err.println("oops.... this should not have happened !");
		System.err.println("Let us try again");
		getInput();
	}
}