package ch02_LinkedLists.q03_DeleteMiddleNode;

import ch02_LinkedLists.Node;

public class DeleteMiddleNode {

	public static void removeNode(Node n) {
		Node prev = n;
		Node curr = n.next;
		while (curr != null) {
			prev.data = curr.data;
			if (curr.next == null) {
				prev.next = null;
			}
			prev = curr;
			curr = curr.next;
		}
	}

}
