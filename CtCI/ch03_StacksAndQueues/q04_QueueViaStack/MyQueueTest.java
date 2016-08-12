package ch03_StacksAndQueues.q04_QueueViaStack;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class MyQueueTest {
	@Test
	public void test() {
		MyQueue<Integer> queue = new MyQueue<Integer>();
		assertTrue(queue.isEmpty());
		queue.add(3);
		assertEquals(3, (int) queue.peek());
		queue.add(4);
		assertEquals(3, (int) queue.peek());
		assertEquals(3, (int) queue.remove());
		assertEquals(4, (int) queue.peek());
		assertEquals(4, (int) queue.remove());
		assertTrue(queue.isEmpty());

		queue.add(1);
		queue.add(2);
		queue.add(3);
		queue.add(4);
		assertEquals(1, (int) queue.remove());
		assertEquals(2, (int) queue.remove());
		queue.add(5);
		assertEquals(3, (int) queue.remove());
		queue.add(6);
		assertEquals(4, (int) queue.remove());
		queue.add(4);
		assertEquals(5, (int) queue.peek());
		assertEquals(5, (int) queue.remove());
		assertEquals(6, (int) queue.remove());
		assertFalse(queue.isEmpty());
		assertEquals(4, (int) queue.remove());

	}
}
