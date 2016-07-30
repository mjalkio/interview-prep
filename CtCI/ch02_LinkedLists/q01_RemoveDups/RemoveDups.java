package ch02_LinkedLists.q01_RemoveDups;

import java.util.HashSet;

import ch02_LinkedLists.Node;

public class RemoveDups {
	public static void removeDups(Node list) {
		HashSet<Integer> elementsSeen = new HashSet<Integer>();
		Node prev = null;
		Node n = list;
		while (n != null) {
			if (elementsSeen.contains(n.data)) {
				prev.next = n.next;
			} else {
				elementsSeen.add(n.data);
				prev = n;
			}
			n = n.next;
		}
	}
}
