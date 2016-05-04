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
		Stack stack = null;
		
		
		while (true)
		{
			welcome2();
			int listOrArray = s.nextInt();
			
			if (listOrArray == 1) 
				{
					stack = new LLStack();
				}
			else if (listOrArray == 2)
				{
					stack = new ArrayStack();
				}
			else if (listOrArray != 1 && listOrArray != 2)
			{
				System.out.println(listOrArray + " is NOT a 1 or 2!");
				stack = new LLStack();
			}
			
			welcome3();
			String input = s.next();
			System.out.println();
			if (input.startsWith("-")) break;
			if (Evaluator.isValad(stack, input) == true) 
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

	//public static StringBuffer sb = new StringBuffer(welcome());
	
	public static String welcome()
	{
		String line1 = "Hello! Welcome to the expression validator! ";
		System.out.println(line1);
		String line2 = "Copyright © Charles Lynch ";
		System.out.println(line2);
		String line3 = "Will match parentheses in an expression and determine if it is valid.";
		System.out.println(line3);
		System.out.println();
		return line1 + line2 + line3;
	}
	
	public static String welcome2()
	{
		String line1 = "Would you like to use linked-list or array baced stack? ";
		System.out.println(line1);
		String line2 = "Press [1] for linked-list or [2] for array : ";
		System.out.print(line2);
		return line1 + line2;
	}
	public static String welcome3()
	{
		String line1 = "Use only \"(\" and \")\" in your expression, for example: (()()(())) ";
		System.out.println(line1);
		String line2 = "Enter expression (-1 to exit): ";
		System.out.print(line2);
		return line1 + line2;
	}
}
