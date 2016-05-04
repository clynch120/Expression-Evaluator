package valid.expression.tool;
/**
 * 
 * @author Charles
 * array to use stack data type
 */
public class ArrayStack implements Stack
{
	
	public String [] stack = new String [1000000];
	public int size = 0;
	
	@Override
	/**
	 * Adds a string to the top of the list
	 */
	public void push(String item) 
	{
		stack[size] = item + " ";
		size++;
	}

	@Override
	/**
	 * removes the top item on the list also
	 * returns the top item on the list
	 */
	public String pop() 
	{
		String item = stack[size - 1];
		size--;
		return item;
	}

	@Override
	/**
	 * returns the top item on the list
	 */
	public String peek() 
	{
		String item = stack[size - 1];
		return item;
	}

	@Override
	/**
	 * empties the list
	 */
	public void empty() 
	{
		for (int i = 0; i < size; i++)
		{
			stack[i] = "";
		}
		size = 0;
	}

	@Override
	/**
	 * returns the size of the array
	 */
	public int size() 
	{
		return size;
	}

	@Override
	/**
	 * returns the items in the array
	 */
	public String getStackView() 
	{
		String list = "";
		for (int i = size - 1; i >= 0; i--)
		{
			list += stack[i];
		}
		return list;
	}
}
