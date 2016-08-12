package ch03_StacksAndQueues.q05_SortStack;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import ch03_StacksAndQueues.MyStack;

public class SortStackTest {
	@Test
	public void test() {
		MyStack<Integer> stack = new MyStack<Integer>();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		assertEquals("3,2,1", stack.toString());
		SortStack.sortStack(stack);
		assertEquals("1,2,3", stack.toString());
		SortStack.sortStack(stack);
		assertEquals("1,2,3", stack.toString());

		stack = new MyStack<Integer>();
		stack.push(100);
		stack.push(0);
		stack.push(-10);
		stack.push(3);
		stack.push(99);
		assertEquals("99,3,-10,0,100", stack.toString());
		SortStack.sortStack(stack);
		assertEquals("-10,0,3,99,100", stack.toString());

		stack = new MyStack<Integer>();
		stack.push(2);
		stack.push(5);
		stack.push(2);
		stack.push(8);
		assertEquals("8,2,5,2", stack.toString());
		SortStack.sortStack(stack);
		assertEquals("2,2,5,8", stack.toString());

		stack = new MyStack<Integer>();
		assertEquals("", stack.toString());
		SortStack.sortStack(stack);
		assertEquals("", stack.toString());
	}
}
