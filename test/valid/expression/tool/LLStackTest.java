package test.valid.expression.tool;

import java.util.EmptyStackException;

import org.testng.Assert;
import org.testng.annotations.Test;

import valid.expression.tool.LLStack;

public class LLStackTest 
{
	public LLStack ll = new LLStack();
	
	@Test
	public LLStackTest()
	{
		Assert.assertNotNull(new LLStack());
	}
	@Test
	public void pushTest() 
	{
		ll.push("hello");
		ll.push("you");
		ll.push("how");
		Assert.assertEquals(ll.size, 3);
		ll.empty();
	}
	
	@Test (expectedExceptions = EmptyStackException.class)
	public void popTest()
	{
		ll.push("what");
		Assert.assertEquals(ll.pop(), "what");
		ll.empty();
		ll.pop();
	}
	
	
	
	
	@Test
	public void peekTesst()
	{
		ll.push("why");
		Assert.assertEquals(ll.peek(), "why");
		ll.push("are");
		Assert.assertEquals(ll.peek(), "are");
		ll.peek();
	}
	
	@Test
	public void emptyTest()
	{
		ll.push("are");
		ll.push("they");
		ll.empty();
		Assert.assertEquals(ll.size, 0);
	}
	
	@Test
	public void sizeTest()
	{
		ll.push("doing");
		ll.push("here");
		Assert.assertEquals(ll.size, 2);
		ll.pop();
		Assert.assertEquals(ll.size, 1);
		ll.size();
		ll.pop();
		Assert.assertEquals(ll.size, 0);
	}
	
	@Test
	public void getStackViewTest()
	{
		ll.push("you");
		ll.push("to");
		ll.push("day");
		ll.push("good");
		Assert.assertEquals(ll.getStackView(), "good day to you ");
		ll.getStackView();
	}
}
