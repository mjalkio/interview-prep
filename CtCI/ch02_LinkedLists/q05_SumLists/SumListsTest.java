package ch02_LinkedLists.q05_SumLists;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import ch02_LinkedLists.Node;

public class SumListsTest {
	@Test
	public void testSumListsReverse() {
		Node listOne = new Node(new int[] { 7, 1, 6 });
		Node listTwo = new Node(new int[] { 5, 9, 2 });
		assertEquals("2,1,9", SumListsReverse.sumLists(listOne, listTwo)
				.toString());

		listOne = new Node(new int[] { 1 });
		listTwo = new Node(new int[] { 1 });
		assertEquals("2", SumListsReverse.sumLists(listOne, listTwo).toString());

		listOne = new Node(new int[] { 1, 2, 3 });
		listTwo = new Node(new int[] { 1 });
		assertEquals("2,2,3", SumListsReverse.sumLists(listOne, listTwo)
				.toString());

		listOne = new Node(new int[] { 1, 2, 3 });
		listTwo = new Node(new int[] { 0 });
		assertEquals("1,2,3", SumListsReverse.sumLists(listOne, listTwo)
				.toString());
	}

	@Test
	public void testSumListsForward() {
		Node listOne = new Node(new int[] { 7, 1, 6 });
		Node listTwo = new Node(new int[] { 5, 9, 2 });
		assertEquals("1,3,0,8", SumListsForward.sumLists(listOne, listTwo)
				.toString());

		listOne = new Node(new int[] { 1 });
		listTwo = new Node(new int[] { 1 });
		assertEquals("2", SumListsForward.sumLists(listOne, listTwo).toString());

		listOne = new Node(new int[] { 1, 2, 3 });
		listTwo = new Node(new int[] { 1 });
		assertEquals("1,2,4", SumListsForward.sumLists(listOne, listTwo)
				.toString());

		listOne = new Node(new int[] { 1, 2, 3 });
		listTwo = new Node(new int[] { 0 });
		assertEquals("1,2,3", SumListsForward.sumLists(listOne, listTwo)
				.toString());

		listOne = new Node(new int[] { 6, 1, 7 });
		listTwo = new Node(new int[] { 2, 9, 5 });
		assertEquals("9,1,2", SumListsForward.sumLists(listOne, listTwo)
				.toString());
	}
}
