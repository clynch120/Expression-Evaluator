package valid.expression.tool;
/**
 * 
 * @author Charles
 *
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
