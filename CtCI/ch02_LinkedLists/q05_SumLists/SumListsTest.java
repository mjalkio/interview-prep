package ch02_LinkedLists.q05_SumLists;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import ch02_LinkedLists.Node;

public class SumListsTest {
	@Test
	public void test() {
		Node listOne = new Node(new int[] { 7, 1, 6 });
		Node listTwo = new Node(new int[] { 5, 9, 2 });
		assertEquals(912, SumListsReverse.sumLists(listOne, listTwo));

		listOne = new Node(new int[] { 1 });
		listTwo = new Node(new int[] { 1 });
		assertEquals(2, SumListsReverse.sumLists(listOne, listTwo));

		listOne = new Node(new int[] { 1, 2, 3 });
		listTwo = new Node(new int[] { 1 });
		assertEquals(322, SumListsReverse.sumLists(listOne, listTwo));

		listOne = new Node(new int[] { 1, 2, 3 });
		listTwo = new Node(new int[] { 0 });
		assertEquals(321, SumListsReverse.sumLists(listOne, listTwo));
	}
}
