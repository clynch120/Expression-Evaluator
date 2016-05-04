package test.valid.expression.tool;

import org.testng.Assert;
import org.testng.annotations.Test;

import valid.expression.tool.Driver;

public class DriverTest 
{

	public Driver d = new Driver();
	
	@Test
	public void DriverTest()
	{
		Assert.assertNotNull(new Driver());
	}
	
	@Test
	public void mainTest()
	{
		d.main(null);
	}

	@Test
	public void welcomeTest()
	{
		Assert.assertEquals(d.welcome(), "Hello! Welcome to the expression validator! "
				+ "Copyright © Charles Lynch "
				+ "Will match parentheses in an expression and determine if it is valid.");
	}

	@Test
	public void welcome2Test()
	{
		Assert.assertEquals(d.welcome2(), "Would you like to use linked-list or array baced stack? " 
				+ "Press [1] for linked-list or [2] for array : ");
	}

	@Test
	public void welcome3Test()
	{
		Assert.assertEquals(d.welcome3(), "Use only \"(\" and \")\" in your expression, for example: (()()(())) "
				+ "Enter expression (-1 to exit): ");
	}
}
