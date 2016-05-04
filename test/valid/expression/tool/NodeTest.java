package test.valid.expression.tool;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.internal.Graph.Node;

public class NodeTest 
{
	@Test
	public void Node()
	{
		Assert.assertNotNull(new Node(null));
	}
	
}
