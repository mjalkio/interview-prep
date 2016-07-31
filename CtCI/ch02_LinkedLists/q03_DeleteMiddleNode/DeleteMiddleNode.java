package ch02_LinkedLists.q03_DeleteMiddleNode;

import ch02_LinkedLists.Node;

public class DeleteMiddleNode {

	public static void removeNode(Node n) {
		Node next = n.next;
		n.data = next.data;
		n.next = next.next;
	}

}
