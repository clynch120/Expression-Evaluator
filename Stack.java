package valid.expression.tool;
/**
 * 
 * @author Charles
 * push adds item to top of the list
 * pop removes top item from list
 * peek shows top item on list without removing the item
 * empty empties the list
 * size returns number of items in the list
 * get stack view returns all items in the list
 */
public interface Stack 
{
	public abstract void push(String item);
	public abstract String pop();
	public abstract String peek();
	public abstract void empty();
	public abstract int size();
	public abstract String getStackView();
}
