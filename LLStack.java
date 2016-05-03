package valid.expression.tool;

import java.util.EmptyStackException;

/**
 * 
 * @author Charles
 * linked list to use a stack data structure
 *
 */

public class LLStack implements Stack
{
	public Node linkedList = null;
	public int size = 0;
	
	@Override
	/**
	 * Adds a string to the top of the list
	 */
	public void push(String item) 
	{
		Node n = new Node(item);
		n.item = item;
		n.next = null;
		if (linkedList == null) 
			{
			linkedList = n;
			size++;
			}
		else
		{
			n.next = linkedList;
			linkedList = n;
			size++;
		}		
	}


	@Override
	/**
	 * removes the top item on the list also
	 * returns the top item on the list
	 */
	public String pop() 
	{
		String n;
		if (linkedList == null) 
			{
				System.out.println("Error : Empty Stack!");
				throw new EmptyStackException();
			}
		else
		{
			n = linkedList.item;
			linkedList = linkedList.next;
			size--;
		}
		return n;
	}

	@Override
	/**
	 * returns the top item on the list
	 */
	public String peek() 
	{
		String p;
		p = linkedList.item;
		return p;
	}

	@Override
	/**
	 *  empty the list
	 */
	public void empty() 
	{
		while(linkedList != null)
		{
			linkedList = linkedList.next;
		}
		size = 0;
	}

	@Override
	public int size() 
	{
		return size;
	}

	@Override
	/**
	 * returns all items in the stack
	 */
	public String getStackView() 
	{
		Node n = new Node(null);
		String list = "";
		n = linkedList;
		while (n != null)
		{
			list += n.item + " ";
			n = n.next;
		}
		return list;
	}
}