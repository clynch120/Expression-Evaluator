package valid.expression.tool;

import java.util.Scanner;

/**
 * 
 * @author Charles
 *
 */
public class Driver {

	public static void main(String[] args) 
	{
		welcome();
		Scanner s = new Scanner(System.in);
		while (true)
		{
			welcome2();
			String input = s.next();
			System.out.println();
			if (input.startsWith("-")) break;
			if (Evaluator.isValad(input) == true) 
			{
				System.out.println("It is Valad!");
			}
			else
			{
				System.out.println("It is NOT Valad!");
			}
			System.out.println("------------------");
		}
		s.close();
	}

	public static void welcome()
	{
		System.out.println("Hello! Welcome to the expression validator!");
		System.out.println("Copyright © Charles Lynch");
		System.out.println("Will match parentheses in an expression and determine if it is valid.");
		System.out.println();
	}
	
	public static void welcome2()
	{
		System.out.println("Use only \"(\" and \")\" in your expression, for example: (()()(())) ");
		System.out.print("Enter expression (-1 to exit): ");
	}
}
