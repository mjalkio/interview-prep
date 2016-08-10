package ch03_StacksAndQueues.q03_SetOfStacks;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.EmptyStackException;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class SetOfStacksTest {
	@Rule
	public final ExpectedException exception = ExpectedException.none();

	@Test
	public void testSizeOne() {
		SetOfStacks<Integer> setOfStacks = new SetOfStacks<Integer>(1);
		setOfStacks.push(1);
		assertEquals(1, (int) setOfStacks.peek());
		setOfStacks.push(2);
		assertEquals(2, (int) setOfStacks.peek());
		setOfStacks.push(3);
		assertEquals(3, (int) setOfStacks.peek());
		assertEquals(3, (int) setOfStacks.pop());
		assertEquals(2, (int) setOfStacks.pop());
		assertEquals(1, (int) setOfStacks.pop());
		assertTrue(setOfStacks.isEmpty());

		exception.expect(EmptyStackException.class);
		setOfStacks.pop();
	}

	@Test
	public void testSizeThree() {
		SetOfStacks<Integer> setOfStacks = new SetOfStacks<Integer>(3);
		setOfStacks.push(1);
		assertEquals(1, (int) setOfStacks.peek());
		setOfStacks.push(2);
		assertEquals(2, (int) setOfStacks.pop());
		setOfStacks.push(2);
		setOfStacks.push(3);
		assertEquals(3, (int) setOfStacks.peek());
		assertEquals(3, (int) setOfStacks.pop());
		assertEquals(2, (int) setOfStacks.pop());
		assertEquals(1, (int) setOfStacks.pop());
		assertTrue(setOfStacks.isEmpty());
		setOfStacks.push(1);
		setOfStacks.push(2);
		setOfStacks.push(3);
		setOfStacks.push(4);
		setOfStacks.push(5);
		assertEquals(5, (int) setOfStacks.peek());
		assertEquals(5, (int) setOfStacks.pop());
		assertEquals(4, (int) setOfStacks.peek());
		assertEquals(4, (int) setOfStacks.pop());
		assertEquals(3, (int) setOfStacks.peek());
		assertEquals(3, (int) setOfStacks.pop());
		assertEquals(2, (int) setOfStacks.peek());
		assertEquals(2, (int) setOfStacks.pop());
		assertEquals(1, (int) setOfStacks.peek());
		assertEquals(1, (int) setOfStacks.pop());
		assertTrue(setOfStacks.isEmpty());
		exception.expect(EmptyStackException.class);
		setOfStacks.pop();
	}
}
