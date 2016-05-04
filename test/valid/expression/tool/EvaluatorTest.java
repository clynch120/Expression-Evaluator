package test.valid.expression.tool;

import org.testng.Assert;
import org.testng.annotations.Test;

import valid.expression.tool.ArrayStack;
import valid.expression.tool.Evaluator;
import valid.expression.tool.LLStack;

public class EvaluatorTest 
{
	
	@Test
	public EvaluatorTest()
	{
		Assert.assertNotNull(new Evaluator());
	}
	
	@Test
	public void isValadTest()
	{
		Assert.assertEquals(Evaluator.isValad(new ArrayStack(), "()()()"), true);
		Assert.assertEquals(Evaluator.isValad(new ArrayStack(), "()()("), false);
		Assert.assertEquals(Evaluator.isValad(new ArrayStack(), "(())(()((((("), false);
		Assert.assertEquals(Evaluator.isValad(new ArrayStack(), "(())(()))))))"), false);
		Assert.assertEquals(Evaluator.isValad(new ArrayStack(), ")("), false);
		Assert.assertEquals(Evaluator.isValad(new LLStack(), ")("), false);
		Assert.assertEquals(Evaluator.isValad(new LLStack(), "()"), true);
		Assert.assertEquals(Evaluator.isValad(new LLStack(), "(())(()"), false);
		Assert.assertEquals(Evaluator.isValad(new LLStack(), "(())(())))))))"), false);
		Assert.assertEquals(Evaluator.isValad(new LLStack(), "(())(()(((((((("), false);
		Assert.assertEquals(Evaluator.isValad(new ArrayStack(), "(()6(()"), false);
		Assert.assertEquals(Evaluator.isValad(new LLStack(), "(())((5"), false);

	}
}
