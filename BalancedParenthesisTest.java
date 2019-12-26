package cyber.dojo.pratice;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;


public class BalancedParenthesisTest {
	
	@Test
	void notBalancedTest1() {
		
		String parenthesis = "{{)(}}";
			
		assertTrue(!BalancedParenthesis.isParenthesisBalanced(parenthesis));
	}
	
	@Test
	void notBalancedTest2() {
		
		String parenthesis = "({)}";
			
		assertTrue(!BalancedParenthesis.isParenthesisBalanced(parenthesis));
	}
	
	@Test
	void balancedTest1() {
		
		String parenthesis = "[({})]";
			
		assertTrue(BalancedParenthesis.isParenthesisBalanced(parenthesis));
	}

	@Test
	void balancedTest2() {
		
		String parenthesis = "{}([])";
			
		assertTrue(BalancedParenthesis.isParenthesisBalanced(parenthesis));
	}
	
	@Test
	void balancedTest3() {
		
		String parenthesis = "{()}[[{}]]";
			
		assertTrue(BalancedParenthesis.isParenthesisBalanced(parenthesis));
	}
	

}
