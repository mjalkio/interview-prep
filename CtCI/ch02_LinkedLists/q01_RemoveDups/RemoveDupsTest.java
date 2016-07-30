package ch02_LinkedLists.q01_RemoveDups;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import ch02_LinkedLists.Node;

public class RemoveDupsTest {
	@Test
	public void testRemoveDups() {
		Node lst = new Node(1);
		assertEquals("1", lst.toString());
		RemoveDups.removeDups(lst);
		assertEquals("1", lst.toString());

		lst.appendToTail(1);
		assertEquals("1,1", lst.toString());
		RemoveDups.removeDups(lst);
		assertEquals("1", lst.toString());

		lst.appendToTail(1);
		lst.appendToTail(2);
		lst.appendToTail(2);
		assertEquals("1,1,2,2", lst.toString());
		RemoveDups.removeDups(lst);
		assertEquals("1,2", lst.toString());

		lst.appendToTail(1);
		lst.appendToTail(2);
		assertEquals("1,2,1,2", lst.toString());
		RemoveDups.removeDups(lst);
		assertEquals("1,2", lst.toString());

		lst.appendToTail(3);
		lst.appendToTail(3);
		lst.appendToTail(3);
		assertEquals("1,2,3,3,3", lst.toString());
		RemoveDups.removeDups(lst);
		assertEquals("1,2,3", lst.toString());
	}

	@Test
	public void testInPlaceRemoveDups() {
		Node lst = new Node(1);
		assertEquals("1", lst.toString());
		InPlaceRemoveDups.removeDups(lst);
		assertEquals("1", lst.toString());

		lst.appendToTail(1);
		assertEquals("1,1", lst.toString());
		InPlaceRemoveDups.removeDups(lst);
		assertEquals("1", lst.toString());

		lst.appendToTail(1);
		lst.appendToTail(2);
		lst.appendToTail(2);
		assertEquals("1,1,2,2", lst.toString());
		InPlaceRemoveDups.removeDups(lst);
		assertEquals("1,2", lst.toString());

		lst.appendToTail(1);
		lst.appendToTail(2);
		assertEquals("1,2,1,2", lst.toString());
		InPlaceRemoveDups.removeDups(lst);
		assertEquals("1,2", lst.toString());

		lst.appendToTail(3);
		lst.appendToTail(3);
		lst.appendToTail(3);
		assertEquals("1,2,3,3,3", lst.toString());
		InPlaceRemoveDups.removeDups(lst);
		assertEquals("1,2,3", lst.toString());
	}
}
