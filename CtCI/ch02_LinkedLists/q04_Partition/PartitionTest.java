package ch02_LinkedLists.q04_Partition;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import ch02_LinkedLists.Node;

public class PartitionTest {
	public void testPartition(Node partitionedList, int x, int numLessThanX) {
		for (int i = 0; i < numLessThanX; i++) {
			assertTrue(partitionedList.data < x);
			partitionedList = partitionedList.next;
		}
		while (partitionedList != null) {
			assertTrue(partitionedList.data >= x);
		}
	}

	@Test
	public void test() {
		Node lst = new Node(new int[] { 3, 5, 8, 5, 10, 2, 1 });
		int x = 5;
		Node partitioned = Partition.partition(lst, x);
		testPartition(partitioned, x, 3);

		lst = new Node(new int[] { 1, 1, 1 });
		x = 1;
		partitioned = Partition.partition(lst, x);
		testPartition(partitioned, x, 0);

		lst = new Node(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 });
		x = 9;
		partitioned = Partition.partition(lst, x);
		testPartition(partitioned, x, 8);

		lst = new Node(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 });
		x = 10;
		partitioned = Partition.partition(lst, x);
		testPartition(partitioned, x, 9);

		lst = new Node(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 });
		x = 5;
		partitioned = Partition.partition(lst, x);
		testPartition(partitioned, x, 4);
	}
}
