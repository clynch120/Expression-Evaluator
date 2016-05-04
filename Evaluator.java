package valid.expression.tool;
/**
 * 
 * @author Charles
 *
 */
public class Evaluator 
{
	/**
	 * 
	 * @param ll 
	 * 		takes Array or linked list stack
	 * @param input
	 * 		takes string to evaluate
	 * @return
	 * 		returns true if expression is valid
	 * 		returns false if expression is not valid
	 */
	public static boolean isValad(Stack ll, String input)
	{
		for (int i = 0; i < input.length(); i++)
		{
			if (input.charAt(0) == ')') return false;
			if (input.charAt(i) != '(' && input.charAt(i) != ')')
			{
				System.out.println("The character " + input.charAt(i) + " is not valid");
				return false;
			}
			if (input.charAt(i) == '(') ll.push("(");
			else if (input.charAt(i) == ')' && ll.size() > 0) ll.pop();
			else return false;
		}
		if (ll.size() == 0) return true;
		else return false;
	}
}
