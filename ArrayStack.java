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
	public void push(String item) 
	{
		stack[size] = item + " ";
		size++;
	}

	@Override
	public String pop() 
	{
		String item = stack[size - 1];
		size--;
		return item;
	}

	@Override
	public String peek() 
	{
		String item = stack[size - 1];
		return item;
	}

	@Override
	public void empty() 
	{
		for (int i = 0; i < size; i++)
		{
			stack[i] = "";
		}
	}

	@Override
	public int size() 
	{
		return size;
	}

	@Override
	public String getStackView() 
	{
		String list = "";
		for (int i = 0; i < size; i++)
		{
			list += stack[i];
		}
		return list;
	}
}
