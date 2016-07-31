package ch02_LinkedLists.q03_DeleteMiddleNode;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import ch02_LinkedLists.Node;

public class DeleteMiddleNodeTest {
	@Test
	public void test() {
		Node lst = new Node(1);
		lst.appendToTail(2);
		lst.appendToTail(3);
		Node toRemove = lst.next;
		DeleteMiddleNode.removeNode(toRemove);
		assertEquals("1,3", lst.toString());
		lst.appendToTail(4);
		lst.appendToTail(5);
		toRemove = lst.next.next;
		DeleteMiddleNode.removeNode(toRemove);
		assertEquals("1,3,5", lst.toString());
	}
}
