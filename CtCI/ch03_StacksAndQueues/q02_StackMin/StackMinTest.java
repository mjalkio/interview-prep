package ch03_StacksAndQueues.q02_StackMin;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StackMinTest {
	@Test
	public void test() {
		StackMin stack = new StackMin();
		stack.push(1);
		assertEquals(1, (int) stack.min());
		stack.push(2);
		assertEquals(1, (int) stack.min());
		stack.push(3);
		assertEquals(1, (int) stack.min());
		stack.push(0);
		assertEquals(0, (int) stack.min());
		stack.push(-1);
		assertEquals(-1, (int) stack.min());
		stack.pop();
		assertEquals(0, (int) stack.min());
		stack.pop();
		assertEquals(1, (int) stack.min());
	}
}
