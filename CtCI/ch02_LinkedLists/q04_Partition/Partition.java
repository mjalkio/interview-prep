package ch02_LinkedLists.q04_Partition;

import ch02_LinkedLists.Node;

public class Partition {

	public static Node partition(Node lst, int x) {
		Node head = lst;
		Node tail = lst;

		while (lst != null) {
			Node next = lst.next;
			if (lst.data < x) {
				lst.next = head;
				head = lst;
			} else {
				tail.next = lst;
				tail = lst;
			}
			lst = next;
		}
		tail.next = null;
		return head;
	}

}
