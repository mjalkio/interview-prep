package ch02_LinkedLists.q02_ReturnKthToLast;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import ch02_LinkedLists.Node;

public class ReturnKthToLastTest {
	@Test
	public void test() {
		Node lst = new Node(1);
		Node test = ReturnKthToLast.kthToLast(0, lst);
		assertEquals("1", test.toString());
		test = ReturnKthToLast.kthToLast(1, lst);
		assertEquals(null, test);

		lst.appendToTail(2);
		lst.appendToTail(3);
		lst.appendToTail(4);
		test = ReturnKthToLast.kthToLast(3, lst);
		assertEquals("1,2,3,4", test.toString());
		test = ReturnKthToLast.kthToLast(2, lst);
		assertEquals("2,3,4", test.toString());
		test = ReturnKthToLast.kthToLast(1, lst);
		assertEquals("3,4", test.toString());
		test = ReturnKthToLast.kthToLast(0, lst);
		assertEquals("4", test.toString());
		test = ReturnKthToLast.kthToLast(5, lst);
		assertEquals(null, test);

	}
}
