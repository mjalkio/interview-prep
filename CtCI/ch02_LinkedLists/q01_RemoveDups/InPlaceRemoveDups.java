package ch02_LinkedLists.q01_RemoveDups;

import ch02_LinkedLists.Node;

public class InPlaceRemoveDups {
	public static void removeDups(Node list) {
		Node n = list;
		while (n != null) {
			Node runner = n;
			while (runner.next != null) {
				if (runner.next.data == n.data) {
					runner.next = runner.next.next;
				} else {
					runner = runner.next;
				}
			}
			n = n.next;
		}
	}
}
