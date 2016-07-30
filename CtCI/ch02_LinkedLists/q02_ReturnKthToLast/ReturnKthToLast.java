package ch02_LinkedLists.q02_ReturnKthToLast;

import ch02_LinkedLists.Node;

public class ReturnKthToLast {

	public static Node kthToLast(int k, Node lst) {
		Node n = lst;
		Node kAway = lst;
		for (int i = 0; i < k; i++) {
			n = n.next;
			if (n == null) {
				return null;
			}
		}

		while (n != null) {
			n = n.next;
			if (n != null) {
				kAway = kAway.next;
			}
		}

		return kAway;
	}

	public static Node kthToLastSlow(int k, Node lst) {
		int size = 0;
		Node n = lst;
		while (n != null) {
			size++;
			n = n.next;
		}
		if (k >= size) {
			return null;
		}
		int index = size - k - 1;
		n = lst;
		int i = 0;
		while (i < index) {
			n = n.next;
			i++;
		}
		return n;
	}

}
