package test.valid.expression.tool;

import org.testng.Assert;
import org.testng.annotations.Test;

import valid.expression.tool.ArrayStack;

public class ArrayStackTest 
{
	public ArrayStack as = new ArrayStack();
	@Test
	public ArrayStackTest()
	{
		Assert.assertNotNull(new ArrayStack());
	}
	
	@Test 
	public void pushTest()
	{
		as.push("hello");
		as.push("what");
		System.out.println(as.getStackView());
		as.empty();
	}
	
	@Test
	public void popTest()
	{
		as.push("hello");
		as.push("what");
		Assert.assertEquals(as.pop(), "what ");
		Assert.assertEquals(as.pop(), "hello ");
		as.push("what");
		as.pop();
		Assert.assertEquals(as.size(), 0);
		Assert.assertEquals(as.getStackView(), "");
	}
	
	@Test
	public void peekTest()
	{
		as.push("hello");
		Assert.assertEquals(as.peek(), "hello ");
		as.push("what");
		Assert.assertEquals(as.peek(), "what ");
		as.empty();
		Assert.assertEquals(as.size(), 0);
	}
	
	@Test
	public void emptyTest()
	{
		as.push("hoho");
		as.push("bowow");
		Assert.assertEquals(as.size, 2);
		as.empty();
		Assert.assertEquals(as.size, 0);
	}
	
	@Test
	public void sizeTest()
	{
		as.push("mo");
		Assert.assertEquals(as.size(), 1);
		as.push("hohp");
		Assert.assertEquals(as.size(), 2);
		as.pop();
		Assert.assertEquals(as.size(), 1);
		as.empty();
		Assert.assertEquals(as.size(), 0);
	}
	
	@Test
	public void getStackViewTest()
	{
		as.push("here");
		as.push("of");
		as.push("out");
		as.push("get");
		Assert.assertEquals(as.getStackView(), "get out of here ");
	}
}
